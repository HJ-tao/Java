package day0716.entity;

public class Pet {
	private int pId;
	private String pNickName;
	private int pTypeId;
	private String pType;
	private String pSex;
	private String pBirthday;
	private String pDesc;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpNickName() {
		return pNickName;
	}

	public void setpNickName(String pNickName) {
		this.pNickName = pNickName;
	}

	public int getpTypeId() {
		return pTypeId;
	}

	public void setpTypeId(int pTypeId) {
		this.pTypeId = pTypeId;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getpSex() {
		return pSex;
	}

	public void setpSex(String pSex) {
		this.pSex = pSex;
	}

	public String getpBirthday() {
		return pBirthday;
	}

	public void setpBirthday(String pBirthday) {
		this.pBirthday = pBirthday;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	@Override
	public String toString() {
		return "Pet [pId=" + pId + ", pNickName=" + pNickName + ", pTypeId="
				+ pTypeId + ", pType=" + pType + ", pSex=" + pSex
				+ ", pBirthday=" + pBirthday + ", pDesc=" + pDesc + "]";
	}

	public Pet(int pId, String pNickName, int pTypeId, String pType,
			String pSex, String pBirthday, String pDesc) {
		super();
		this.pId = pId;
		this.pNickName = pNickName;
		this.pTypeId = pTypeId;
		this.pType = pType;
		this.pSex = pSex;
		this.pBirthday = pBirthday;
		this.pDesc = pDesc;
	}

	public Pet(int pId, String pNickName, int pTypeId,
			String pSex, String pBirthday, String pDesc) {
		super();
		this.pId = pId;
		this.pNickName = pNickName;
		this.pTypeId = pTypeId;
		this.pSex = pSex;
		this.pBirthday = pBirthday;
		this.pDesc = pDesc;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
