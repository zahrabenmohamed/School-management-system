package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher t1=new Teacher(1,"hassane",3000);
        Teacher t2=new Teacher(1,"ali",5000);
        Teacher t3=new Teacher(1,"Mustafa",8000);
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);



        Student s1=new Student(1,"younouss",1);
        Student s2=new Student(2,"siraj",12);
        Student s3=new Student(3,"sawsan",2);
        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);


        School sc1=new School(teachers,students);
        System.out.println("total: "+sc1.getTotalMoneyEraned() +'$');
        s1.setFeesPaid(4000);
        System.out.println("fees paid is : "+s1.getFeesPaid());
        System.out.println("the remaianing fees of the student "+s1.getName()+" is " +s1.remainingFees() +"$");
        System.out.println("School has earned : " +sc1.getTotalMoneyEraned());








    }
}
