package com.codebind;

import java.util.ArrayList;

import org.joda.time.DateTime;



public class CourseProgramme {
private String courseName;
private ArrayList<Module> module = new ArrayList<Module>();
private DateTime StartDate,EndDate;


public CourseProgramme(String cName,ArrayList<Module> m,DateTime sDate,DateTime eDate){
this.courseName=cName;
this.module=m;
this.StartDate=sDate;
this.EndDate=eDate;
}


public String getCourseName() {
	return this.courseName;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}


public DateTime getStartDate() {
	return this.StartDate;
}

public DateTime getEndDate() {
	return this.EndDate;
}

public ArrayList<Module> getModule() {
	return this.module;
}


}