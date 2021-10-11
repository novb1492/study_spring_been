package com.spring.quiz;



import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main");
		// new Scanner() 만 가능.
		String location = "classpath:di_ex3.xml";
		GenericXmlApplicationContext gac = new GenericXmlApplicationContext(location);
		PrintBean pb = gac.getBean("pb", PrintBean.class);
		pb.getPs();
		SaveClass saveClass= gac.getBean("sc", SaveClass.class);
		saveClass.getResult();
	}

}
