package day11;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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
		
		public ClientHandler(Socket socket){
			this.socket = socket;
		}
		
		public void run(){
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
					System.out.println("�ͻ���˵:"+message);
				}
				
				
				
			} catch (Exception e) {
				
			}
		}
	}
}




