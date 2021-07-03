package edu.cj.javaee.day0714.dao;

import java.util.List;

import edu.cj.javaee.day0714.entity.Train;

public interface TrainDAO {
   List<Train> getAllTrains(); //��ѯ���л𳵳�����Ϣ
   Train getTrainByNo(String no); //���ݻ𳵵ĳ��β�ѯ�ó��ζ�Ӧ�Ļ𳵳�����Ϣ
   int addTrain(Train t);  //��ӻ𳵳���
   boolean  deleteTrainByNo(String no);  //����˵������ɾ��
   int updateTrain(Train t);  //�޸Ļ𳵳���
}
