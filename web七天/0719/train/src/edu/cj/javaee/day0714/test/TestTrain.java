package edu.cj.javaee.day0714.test;

import java.util.List;

import edu.cj.javaee.day0714.dao.TrainDAO;
import edu.cj.javaee.day0714.dao.impl.TrainDAOImpl;
import edu.cj.javaee.day0714.entity.Train;

public class TestTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrainDAO dao = new TrainDAOImpl();
		/*List<Train> list = dao.getAllTrains();
		System.out.println(list);*/
		Train t= new Train("D3053","�˲���","���","15:46","18:16","����","2.5",480);
        int i =  dao.addTrain(t);
        if (i>0) {
		   System.out.println("��ӻ𳵳ɹ�");	
		}else{
			System.out.println("��ӻ�ʧ��");	
		}
	}

}
