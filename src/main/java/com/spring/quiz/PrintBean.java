package com.spring.quiz;

public class PrintBean {
	private String string;
	private PrintString ps;
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public void getPs() {
		 ps.printString(this.string);
	}
	public void setPs(PrintString ps) {
		this.ps = ps;
	}
	
	
}
