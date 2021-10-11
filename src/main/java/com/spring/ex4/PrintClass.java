package com.spring.ex4;

import java.util.HashMap;
import java.util.List;

public class PrintClass {

	public void print(int data1, String oper, int data2, int result) {
		System.out.println(data1 + " " + oper + " " + data2 + " = " + result);
	}
	public void print(List<String>names,HashMap<String, String>infor) {
		for(String s:names) {
			System.out.println("상호명: "+s);
			System.out.println("김밥: "+infor.get("김밥"));
			System.out.println("라면: "+infor.get("라면"));
			System.out.println();
		}
	}
}
