package com.spring.quiz;

public class SaveClass {
	private int data1, data2, result;
	private String oper;
	private PrintClass pc;
	private OperationClass oc;
	/*
	 * OperationClass 내 operation 메소드 제작
	 * 기능은 사칙 연산(+,-,*, /) 
	 * 반환데이터 : 사칙연산 결과
	 */
	private void setReulst() {
		this.result = oc.operation(data1, data2, oper);
	}
	/*
	 * PrintClass 내 print 메소드 제작
	 * 매개변수의 데이터 출력
	 * ex) 10 + 20 = 30
	 */
	public void getResult() {
		setReulst();
		pc.print(data1, oper, data2, result);
	}
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	public String getOper() {
		return oper;
	}
	public void setOper(String oper) {
		this.oper = oper;
	}
	public PrintClass getPc() {
		return pc;
	}
	public void setPc(PrintClass pc) {
		this.pc = pc;
	}
	public OperationClass getOc() {
		return oc;
	}
	public void setOc(OperationClass oc) {
		this.oc = oc;
	}
	
	
	
}
