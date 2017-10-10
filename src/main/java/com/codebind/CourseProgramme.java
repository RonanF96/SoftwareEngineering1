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
this.setStartDate(sDate);
this.setEndDate(eDate);
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


public void setStartDate(DateTime startDate) {
	StartDate = startDate;
}


public DateTime getEndDate() {
	return this.EndDate;
}


public void setEndDate(DateTime endDate) {
	EndDate = endDate;
}
public ArrayList<Module> getModule() {
	return this.module;
}


}