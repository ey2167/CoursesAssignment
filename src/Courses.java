/**
 * EloheYonas
 * for this project, i will be using the class "Courses" as the basis for the rest.
 * the Class Courses will be given the properties: coursetitle, coursenumber, coursedescription, and coursedepartment
 * the classes to inherit the course superclass will be English, Physics, and Sculpture 
 * a driver class will be created to test and display the Class' properties
 */
public class Courses {
	private String coursetitle;
	private int coursenumber;
	private String coursedescription;
	private String coursedepartment;
 protected Courses(){
	
}
protected Courses(String coursetitle, int coursenumber, String coursedescription, String coursedepartment){
	this.coursetitle = coursetitle;
	this.coursedescription = coursedescription;
	this.coursenumber = coursenumber;
	this.coursedepartment = coursedepartment;
}
public String toString(){
	return "this course is " + coursetitle + coursenumber + "." + coursedescription + "this is course is run by the department of" + coursedepartment;
}
}
