package com.spring.ex4;

import java.util.HashMap;
import java.util.List;

public class SaveClass {
	private PrintClass pc;
	private List<String>names;
	private HashMap<String, String>infor;
	public void show() {
		this.pc.print(names,infor);
	}
	public PrintClass getPc() {
		return pc;
	}
	public void setPc(PrintClass pc) {
		this.pc = pc;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public HashMap<String, String> getInfor() {
		return infor;
	}
	public void setInfor(HashMap<String, String> infor) {
		this.infor = infor;
	}
	

	
	
	
	
}
