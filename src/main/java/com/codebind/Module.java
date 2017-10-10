package com.codebind;



public class Module {
private String moduleName;
private String moduleID;
private Student stuList[];
	
	public Module(String modName,String modID,Student sList[]){
		this.moduleName=modName;
		this.moduleID=modID;
		this.stuList=sList;
	}

	public String getModuleName() {
		return this.moduleName;
	}


	public String getModuleID() {
		return this.moduleID;
	}

	
	public Student[] getSList() {
		return this.stuList;
	}
}

