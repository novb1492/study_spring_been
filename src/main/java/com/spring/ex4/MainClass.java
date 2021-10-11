package com.spring.ex4;



import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main");
		// new Scanner() 만 가능.
		String location = "classpath:di_ex4.xml";
		GenericXmlApplicationContext gac = new GenericXmlApplicationContext(location);
		SaveClass saveClass=gac.getBean("sc",SaveClass.class);
		saveClass.show();
		
	}

}
