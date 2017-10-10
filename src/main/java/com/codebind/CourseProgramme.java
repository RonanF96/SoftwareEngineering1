package com.codebind;

import org.joda.time.DateTime;

public class CourseProgramme {
private String courseName;
private Module modList[];
private DateTime StartDate,EndDate;


public CourseProgramme(String cName,Module[] mList,DateTime sDate,DateTime eDate){
this.courseName=cName;
this.modList=mList;
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
public Module[]getMList(){
	return this.modList;
}


}