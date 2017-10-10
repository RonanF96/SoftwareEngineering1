package com.codebind;

import java.util.ArrayList;

public class Module {
private String moduleName;
private String moduleID;
private ArrayList<Student> stuList = new ArrayList<Student>();
	
	public Module(String modName,String modID,ArrayList<Student> SList){
		this.setModuleName(modName);
		this.setModuleID(modID);
		this.stuList=SList;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleID() {
		return moduleID;
	}

	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	public void addStudent(Student newStudent){
		stuList.add(newStudent);
	}
	public ArrayList<Student>getSList() {
		return stuList;
	}
}

