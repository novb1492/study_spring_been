package com.spring.quiz;

public class OperationClass {

	public int operation(int data1, int data2, String oper) {
		int result = 0;
		
		if(oper.equals("+")) {
			result = data1 + data2;
		}else 	if(oper.equals("-")) {
			result = data1 - data2;
		}else 	if(oper.equals("*")) {
			result = data1 * data2;
		}else 	if(oper.equals("/")) {
			result = data1 / data2;
		}
		
		return result;
	}

}
