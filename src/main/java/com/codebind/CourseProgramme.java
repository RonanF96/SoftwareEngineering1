package com.codebind;

import java.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
private String courseName;
private ArrayList<Module> modList= new ArrayList<Module>();
private LocalDate StartDate,EndDate;


public CourseProgramme(String cName,ArrayList<Module> MList,LocalDate sDate,LocalDate eDate){
this.setCourseName(cName);
this.modList=MList;
this.setStartDate(sDate);
this.setEndDate(eDate);
}


public String getCourseName() {
	return this.courseName;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}


public LocalDate getStartDate() {
	return this.StartDate;
}


public void setStartDate(LocalDate startDate) {
	StartDate = startDate;
}


public LocalDate getEndDate() {
	return this.EndDate;
}


public void setEndDate(LocalDate endDate) {
	EndDate = endDate;
}
public ArrayList<Module>getMList(){
	return this.modList;
}
public void addModule(Module newModule){
	modList.add(newModule);
}

}