package day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author adminitartor
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * Socket封装了TCP协议,使用它可以进行
	 * TCP通讯.
	 */
	private Socket socket;
	
	/**
	 * 构造方法,用来初始化客户端
	 */
	public Client(){
		try {
			/*
			 * 实例化Socket时需要传入两个
			 * 参数:
			 * 1:服务端计算机的IP地址,通过
			 *   它可以找到网络上的服务端
			 *   计算机
			 * 2:服务端口,该端口是服务端程序
			 *   启动后向它的计算机申请的,我
			 *   们通过这个端口就可以找到运行
			 *   服务端计算机上的这个服务端
			 *   应用程序了.
			 *   
			 * 而且实例化Socket过的过程就是
			 * 连接服务端的过程,在实例化时
			 * 就会按照给定的地址与端口进行
			 * 网络连接,若服务端没有响应,这里
			 * 会抛出异常    
			 * 
			 * localhost:表示本机地址
			 */
			System.out.println("正在连接服务端...");
			socket = new Socket(
				"localhost",8088
			);
			System.out.println("已连接!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 开始客户端工作的方法
	 */
	public void start(){
		try {
			//启动接收服务端消息的线程
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			
			Scanner scanner = new Scanner(System.in);
			/*
			 * Socket提供方法:
			 * OutputStream getOutputStream()
			 * 该方法会获取一个输出流,通过该
			 * 流写出的数据会发送给远端计算机
			 * 对于客户端这边而言,远端就是
			 * 服务端
			 */
			OutputStream out
				= socket.getOutputStream();
			OutputStreamWriter osw
				= new OutputStreamWriter(
					out,"UTF-8");
			PrintWriter pw
				= new PrintWriter(osw,true);
			String message = null;
			
			long lastSend = System.currentTimeMillis()-500;
			while(true){
				message = scanner.nextLine();
				if(System.currentTimeMillis()-lastSend<500){
					System.out.println("说话速度太快了...");
					continue;
				}
				lastSend = System.currentTimeMillis();
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
	/**
	 * 该线程负责接收服务端发送过来的消息
	 * @author adminitartor
	 *
	 */
	class ServerHandler implements Runnable{
		public void run(){
			try {
				
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
						socket.getInputStream(),"UTF-8"	
					)	
				);
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}





