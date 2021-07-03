package edu.cj.javaee.day0714.service;

import java.util.List;

import edu.cj.javaee.day0714.entity.Train;

public interface TrainService {
   List<Train> getAllTrains(); //查询所有火车车次信息
   Train getTrainByNo(String no); //根据火车的车次查询该车次对应的火车车次信息
   int addTrain(Train t);  //添加火车车次
   boolean  deleteTrainByNo(String no);  //根据说车车次删除
   int updateTrain(Train t);  //修改火车车次
}
