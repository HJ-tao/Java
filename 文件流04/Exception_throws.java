package day09;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ������д����һ������throws�쳣�����ķ���
 * ʱ��throws����д׼��
 * @author adminitartor
 *
 */
public class Exception_throws {
	public void dosome()
		throws IOException,AWTException{
		
	}
}

class Son extends Exception_throws{
	//�������׳��κ��쳣
//	public void dosome(){
//			
//	}
	
	//���׳����෽���׳��Ĳ����쳣
//	public void dosome()throws IOException{
//			
//	}
	
	//�����׳����෽���׳��쳣���������쳣
//	public void dosome()
//		throws FileNotFoundException{
//			
//	}
	
	//�������׳������쳣
//	public void dosome()
//			throws SQLException{
//			
//    }
	
	//�������׳����෽���׳��쳣�ĸ������쳣
//	public void dosome()
//			throws Exception{
//			
//	}
}









