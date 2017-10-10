package com.codebind;

import java.util.ArrayList;

public class Module {
private String moduleName;
private String moduleID;
private ArrayList<Student> student = new ArrayList<Student>();
	
	public Module(String modName,String modID,ArrayList<Student> s){
		this.moduleName=modName;
		this.moduleID=modID;
		this.student=s;
	}

	public String getModuleName() {
		return this.moduleName;
	}


	public String getModuleID() {
		return this.moduleID;
	}

	
	public ArrayList<Student> getStudent() {
		return this.student;
	}
}

