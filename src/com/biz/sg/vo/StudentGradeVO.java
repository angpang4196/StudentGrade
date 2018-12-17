package com.biz.sg.vo;

public class StudentGradeVO {

	private String strNum;  // 학번
	private String strName; // 이름
	private String strTel; // 전화번호
	private String strAddr; // 주소

	private int intKor; // 국어점수
	private int intEng; // 영어점수
	private int intMath; // 수학점수
	private int intSum; // 3과목 총점
	private float floatAvg; // 3과목 평균

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFloatAvg() {
		return floatAvg;
	}

	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	@Override
	public String toString() {
		return "StudentGradeVO [strNum=" + strNum + ", strName=" + strName + ", strTel=" + strTel + ", strAddr="
				+ strAddr + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", intSum=" + intSum
				+ ", floatAvg=" + floatAvg + "]";
	}

}
