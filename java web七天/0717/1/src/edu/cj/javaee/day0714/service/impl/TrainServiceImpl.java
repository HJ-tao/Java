package edu.cj.javaee.day0714.service.impl;

import java.util.List;

import edu.cj.javaee.day0714.dao.TrainDAO;
import edu.cj.javaee.day0714.dao.impl.TrainDAOImpl;
import edu.cj.javaee.day0714.entity.Train;
import edu.cj.javaee.day0714.service.TrainService;

public class TrainServiceImpl implements TrainService {
    private TrainDAO dao;
   public TrainServiceImpl(){
    	this.dao = new TrainDAOImpl();
    }
	public List<Train> getAllTrains() {
		//业务判断 校验、处理....
		return dao.getAllTrains();
	}

	public Train getTrainByNo(String no) {
		// TODO Auto-generated method stub
		return dao.getTrainByNo(no);
	}

	public int addTrain(Train t) {
		
		return dao.addTrain(t);
	}

	public boolean deleteTrainByNo(String no) {
		// TODO Auto-generated method stub
		return dao.deleteTrainByNo(no);
	}

	public int updateTrain(Train t) {
		// TODO Auto-generated method stub
		return dao.updateTrain(t);
	}

}
