package edu.cj.javaee.day0714.entity;

public class Train {
	private String trainNo; // »ð³µ³µ´Î
	private String startStation;
	private String arrivalStation;
	private String startTime;
	private String arrivalTime;
	private String type;
	private String runtime;
	private float mile;

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public float getMile() {
		return mile;
	}

	public void setMile(float mile) {
		this.mile = mile;
	}

	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", startStation=" + startStation
				+ ", arrivalStation=" + arrivalStation + ", startTime="
				+ startTime + ", arrivalTime=" + arrivalTime + ", type=" + type
				+ ", runtime=" + runtime + ", mile=" + mile + "]";
	}

	public Train(String trainNo, String startStation, String arrivalStation,
			String startTime, String arrivalTime, String type, String runtime,
			float mile) {
		super();
		this.trainNo = trainNo;
		this.startStation = startStation;
		this.arrivalStation = arrivalStation;
		this.startTime = startTime;
		this.arrivalTime = arrivalTime;
		this.type = type;
		this.runtime = runtime;
		this.mile = mile;
	}

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

}
