package com.wipro.model;

public class TotalMarks {
	private int m;
	private int s;
	private int e;
	public TotalMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TotalMarks(int m, int s, int e) {
		super();
		this.m = m;
		this.s = s;
		this.e = e;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "TotalMarks [m=" + m + ", s=" + s + ", e=" + e + "]";
	}
	

}
