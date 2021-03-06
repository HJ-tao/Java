package day11;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * @author adminitartor
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * Socket��װ��TCPЭ��,ʹ�������Խ���
	 * TCPͨѶ.
	 */
	private Socket socket;
	
	/**
	 * ���췽��,������ʼ���ͻ���
	 */
	public Client(){
		try {
			/*
			 * ʵ����Socketʱ��Ҫ��������
			 * ����:
			 * 1:����˼������IP��ַ,ͨ��
			 *   �������ҵ������ϵķ����
			 *   �����
			 * 2:����˿�,�ö˿��Ƿ���˳���
			 *   �����������ļ���������,��
			 *   ��ͨ������˿ھͿ����ҵ�����
			 *   ����˼�����ϵ���������
			 *   Ӧ�ó�����.
			 *   
			 * ����ʵ����Socket���Ĺ��̾���
			 * ���ӷ���˵Ĺ���,��ʵ����ʱ
			 * �ͻᰴ�ո����ĵ�ַ��˿ڽ���
			 * ��������,�������û����Ӧ,����
			 * ���׳��쳣    
			 * 
			 * localhost:��ʾ������ַ
			 */
			System.out.println("�������ӷ����...");
			socket = new Socket(
				"localhost",8088
			);
			System.out.println("������!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ʼ�ͻ��˹����ķ���
	 */
	public void start(){
		try {
			Scanner scanner = new Scanner(System.in);
			/*
			 * Socket�ṩ����:
			 * OutputStream getOutputStream()
			 * �÷������ȡһ�������,ͨ����
			 * ��д�������ݻᷢ�͸�Զ�˼����
			 * ���ڿͻ�����߶���,Զ�˾���
			 * �����
			 */
			OutputStream out
				= socket.getOutputStream();
			OutputStreamWriter osw
				= new OutputStreamWriter(
					out,"UTF-8");
			PrintWriter pw
				= new PrintWriter(osw,true);
			String message = null;
			while(true){
				message = scanner.nextLine();
				pw.println(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





