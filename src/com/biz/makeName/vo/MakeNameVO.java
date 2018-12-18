package com.biz.makeName.vo;

public class MakeNameVO {
	
	private String strName;
	private String strNum;
	private String strCount;
	
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrCount() {
		return strCount;
	}
	public void setStrCount(String strCount) {
		this.strCount = strCount;
	}
	@Override
	public String toString() {
		return "MakeNameVO [strName=" + strName + ", strNum=" + strNum + ", strCount=" + strCount + "]";
	}

}
