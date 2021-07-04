package day02;
/**
 * ����HTTP�����е���������Ϣ
 * �����и�ʽ:
 * method uri protocol-version
 * ����  ��Դ·��  Э��汾
 * 
 * ����:
 * GET /index.html HTTP/1.1
 * @author soft01
 *
 */
public class Test {
	public static void main(String[] args) {
		String method;
		String uri;
		String protocol;
		
		String request = "GET /reg?username=fanchuanqi&password=123456 HTTP/1.1";
		String[] ss = request.split("\\s");
		method = ss[0];
		uri = ss[1];
		protocol = ss[2];
		System.out.println(method);
		System.out.println(uri);
		System.out.println(protocol);
		
		parseUri(uri);
	}
	
	public static void parseUri(String uri){
		/*
		 * loc:/reg
		 * username:fanchuangqi
		 * password:123456
		 */
		String[] data = uri.split("[=\\?&]");
		String loc = data[0];
		String username = data[2];
		String password = data[4];
		System.out.println("loc:"+loc);
		System.out.println(data[1]+":"+username);
		System.out.println(data[3]+":"+password);
		
	}
}
