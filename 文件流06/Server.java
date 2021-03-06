package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * �����ҷ����
 * @author adminitartor
 *
 */
public class Server {
	/**
	 * java.net.ServerSocket
	 * �����ڷ���˵�Socket,��Ҫ����������:
	 * 1:�����ϵͳ�������˿�,�ͻ��˾���
	 *   ͨ������˿��ҵ������Ӧ�ó����
	 * 2:��������˿�,���ͻ���ʵ����Socket��
	 *   ͨ��ServerSocket����˿ڷ�������ʱ,
	 *   ServerSocket���ܸ�֪����ʵ����һ��
	 *   Socket��ÿͻ���ͨѶ.  
	 */
	private ServerSocket server;
	/*
	 * �������пͻ��˵������,�����㲥
	 * ��Ϣʹ��
	 */
	private List<PrintWriter> allOut;
	
	public Server(){
		try {
			/*
			 * ʵ����ServerSocket��ͬʱָ��
			 * ����˿�
			 * �ö˿ڲ��������ϵͳ������Ӧ��
			 * �����Ѿ�����Ķ˿ڳ�ͻ,����ʵ��
			 * ��ʧ��,�׳���ַ��ռ�õ��쳣.
			 * 
			 */
			server = new ServerSocket(8088);
			
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try {
			/*
			 * ServerSocket�ṩ����
			 * Socket accept()
			 * �÷�����һ����������,������
			 * ��������˿�,ֱ��һ���ͻ���
			 * ���ӹ���Ϊֹ,Ȼ�󷵻�һ��Socket
			 * ʵ��,ͨ����Socket�Ϳ������
			 * ���ӵĿͻ��˽���������.
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
				
				//����һ���߳�������ÿͻ��˵Ľ���
				ClientHandler handler 
					= new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���߳������Ǹ����������Socket��Ӧ
	 * �Ŀͻ��˽��н���
	 * @author adminitartor
	 *
	 */
	class ClientHandler implements Runnable{
		//���߳�ͨ�����Socket��ͻ��˽���
		private Socket socket;
		//Զ�˼����(�ͻ���)��ַ��Ϣ
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			//��ȡԶ�˼������ַ��Ϣ
			InetAddress address 
				= socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				
				/*
				 * Socket�ṩ�˷���:
				 * InputStream getInputStream()
				 * ͨ�������������Զ�ȡԶ�˼����
				 * ���͹�������Ϣ.
				 */
				InputStream in 
					= socket.getInputStream();
					
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
					
				BufferedReader br
					= new BufferedReader(isr);
				
				//���������	
				OutputStream out
					= socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
					
				//������������빲����
				synchronized (allOut) {
					allOut.add(pw);
				}
	
				String message = null ;
				/*
				 * ʹ��readLine������ȡ�ͻ��˷��͹�����
				 * ÿһ���ַ���ʱ,�ͻ��˶Ͽ����Ӻ�,����
				 * ��Ӧ���ݿͻ���ϵͳ��ͬ���������:
				 * 1:windows�Ŀͻ��˶Ͽ���:readLine������
				 * ֱ���׳��쳣.
				 * 
				 * 2:linux�Ŀͻ��˶Ͽ����Ӻ�:readLine����
				 * �᷵��null
				 */
				while((message = br.readLine())!=null){
//					System.out.println("�ͻ���˵:"+message);
//					pw.println(message);
					//ת�������пͻ���
					synchronized (allOut) {
						for(PrintWriter p : allOut){
							p.println(host+"˵:"+message);
						}
					}
				}
				
			} catch (Exception e) {
				
			} finally{
				//����ͻ��˶Ͽ����ӵĲ���
				
				//���ÿͻ��˵�������ӹ�������ɾ��
				synchronized (allOut) {
					allOut.remove(pw);
				}
				
				//��Socket�ر��ͷ���Դ
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}




