package Task3;

import Task2.Mobile;

public class Course {
    private String courseCode;
    private String courseName;
    private int creditHour;
    Course(){

}
Course(String CC, String CName, int Ch){
    this.courseName=CName;
    this.courseCode=CC;
    this.creditHour=Ch;
}
void display(){
    System.out.println("Name: " +courseName+ "Code Number:" +courseCode+ "Credit Hour: "+creditHour);
}
public static void main(String[] args){
    Course C1= new Course();
    Course C2= new Course("SS1012","Pakistan Studies",2);
    C1.display();
    C2.display();
}
}
