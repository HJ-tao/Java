package day0719.entity;

public class Ware {
	private String wareName;
	private int wareSort;
	private int wareAmount;

	public String getWareName() {
		return wareName;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	public int getWareSort() {
		return wareSort;
	}

	public void setWareSort(int wareSort) {
		this.wareSort = wareSort;
	}

	public int getWareAmount() {
		return wareAmount;
	}

	public void setWareAmount(int wareAmount) {
		this.wareAmount = wareAmount;
	}

	@Override
	public String toString() {
		return "Ware [wareName=" + wareName + ", wareSort=" + wareSort
				+ ", wareAmount=" + wareAmount + "]";
	}

	public Ware(String wareName, int wareSort, int wareAmount) {
		super();
		this.wareName = wareName;
		this.wareSort = wareSort;
		this.wareAmount = wareAmount;
	}

	public Ware() {
		super();
		// TODO Auto-generated constructor stub
	}

}
