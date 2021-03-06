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
 * 聊天室服务端
 * @author adminitartor
 *
 */
public class Server {
	/**
	 * java.net.ServerSocket
	 * 运行在服务端的Socket,主要有两个作用:
	 * 1:向操作系统申请服务端口,客户端就是
	 *   通过这个端口找到服务端应用程序的
	 * 2:监听服务端口,当客户端实例化Socket并
	 *   通过ServerSocket服务端口发起连接时,
	 *   ServerSocket就能感知到并实例化一个
	 *   Socket与该客户端通讯.  
	 */
	private ServerSocket server;
	/*
	 * 保存所有客户端的输出流,用来广播
	 * 消息使用
	 */
	private List<PrintWriter> allOut;
	
	public Server(){
		try {
			/*
			 * 实例化ServerSocket的同时指定
			 * 服务端口
			 * 该端口不能与操作系统上其他应用
			 * 程序已经申请的端口冲突,否则实例
			 * 化失败,抛出地址被占用的异常.
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
			 * ServerSocket提供方法
			 * Socket accept()
			 * 该方法是一个阻塞方法,作用是
			 * 监听服务端口,直到一个客户端
			 * 连接过来为止,然后返回一个Socket
			 * 实例,通过该Socket就可以与刚
			 * 连接的客户端交互数据了.
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了!");
				
				//启动一个线程来处理该客户端的交互
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
	 * 该线程任务是负责与给定的Socket对应
	 * 的客户端进行交互
	 * @author adminitartor
	 *
	 */
	class ClientHandler implements Runnable{
		//该线程通过这个Socket与客户端交互
		private Socket socket;
		//远端计算机(客户端)地址信息
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			//获取远端计算机地址信息
			InetAddress address 
				= socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				
				/*
				 * Socket提供了方法:
				 * InputStream getInputStream()
				 * 通过该输入流可以读取远端计算机
				 * 发送过来的消息.
				 */
				InputStream in 
					= socket.getInputStream();
					
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
					
				BufferedReader br
					= new BufferedReader(isr);
				
				//创建输出流	
				OutputStream out
					= socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
					
				//将该输出流存入共享集合
				synchronized (allOut) {
					allOut.add(pw);
				}
	
				String message = null ;
				/*
				 * 使用readLine方法读取客户端发送过来的
				 * 每一行字符串时,客户端断开连接后,这里
				 * 反应根据客户端系统不同有两种情况:
				 * 1:windows的客户端断开后:readLine方法会
				 * 直接抛出异常.
				 * 
				 * 2:linux的客户端断开连接后:readLine方法
				 * 会返回null
				 */
				while((message = br.readLine())!=null){
//					System.out.println("客户端说:"+message);
//					pw.println(message);
					//转发给所有客户端
					synchronized (allOut) {
						for(PrintWriter p : allOut){
							p.println(host+"说:"+message);
						}
					}
				}
				
			} catch (Exception e) {
				
			} finally{
				//处理客户端断开连接的操作
				
				//将该客户端的输出流从共享集合中删除
				synchronized (allOut) {
					allOut.remove(pw);
				}
				
				//将Socket关闭释放资源
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}




