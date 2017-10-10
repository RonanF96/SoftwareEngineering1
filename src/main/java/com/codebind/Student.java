package com.codebind;

public class Student {

private String name;
private String dob;
private int id;
private int age;


public Student(String name,String dob,int age){
	
	this.name=name;
	this.getUsername();
	this.dob = dob;
	this.age=age;
	this.id=id++;
}

public void setName( String name ) {
   this.name = name;
}
public String getName()
{
  return name;

}
public int getAge() {
	return age;
}

public void setBirthDate(String dob) {
    this.dob= dob;
    
}

public String getBirthDate() {
    return dob;
}

public String getUsername() {
	return name + age;
}
public void setUsername(String username) {
}



public static class studentExample{
	
	public static void main(String[] args){
		
	Student ronan= new Student("ronan","08/01/1996", 21);

	System.out.println("Date of birth: " + ronan.getBirthDate() +" " + "Username: " + ronan.getUsername());
	
}

	
}
}

