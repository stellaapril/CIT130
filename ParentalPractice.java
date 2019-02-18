/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2inheritance;
class Student{
    String name;
    int StudID;
    String gender;
    int age;
}//close student

class ElemStudent extends Student{
    String allergies;
    int emergencyContactPhone;
        
}//close ElemStudent

class HighschoolStudent extends Student{
    int phonenumber;
    double GPA;
    
}//close HighschoolStudent

class CollegeStudent extends Student{
    String major;
}//close class
/**
 *
 * @author sitian.chen
 */
public class ParentalPractice {
    public static void main(String[] args){
        
        Student stud = new Student();
        ElemStudent elemStud = new ElemStudent();
        elemStud.name ="Crusoe";
        elemStud.allergies="email,homework,peanut,math";
        elemStud.emergencyContactPhone = 1234561111;
    
        HighschoolStudent highStud = new HighschoolStudent();
        highStud.name = "Julia";
        highStud.GPA = 3.89;
        highStud.phonenumber = 8888888;
        
        CollegeStudent collegestud = new CollegeStudent();
        collegestud.name="Joe";
        collegestud.StudID=11121115;
        
        //array of student
        Student[] studs = new Student[6];
        studs[0]= new ElemStudent();
        studs[1]= new HighschoolStudent();
        studs[2]=new CollegeStudent();
        
        for(int i=0;i<studs.length;i++){
            
            Object o = studs[i];
            
            boolean b = o instanceof ElemStudent;
            if(o instanceof ElemStudent){
               ElemStudent anotherElemStudVar = (ElemStudent)stud;
               printElemStudent(anotherElemStudVar);
            }
            
        }//close for
        
        HighschoolStudent stud1=new HighschoolStudent();
        
        
        // I can store a subclass in a variable typed
        //to the superclass!Handy because I can write
        //code that operates on the superclass before
        //the subclass has even been written
        
        //type casting the student object to elemstudent 
        
        //demonstrate to your neighbor that you can use instance of 
        //correctly and carry out a typecast see section 11
      

        
    }//close main
    public static void printElemStudent(ElemStudent s){
        System.out.println(s.name);
    }
}
