package com.company;
/**
 * created By zahra at 11/21/2022 at 10:13 am
 * This class is an blueprint of student object
 */
public class Student {
    /** those called fields or attributes or properties of the class */
     private  int id;
     private String name;
     private int grade ;
     private    int feesPaid;
     private int feesTotal;
    /**
     * constructor with args to create a new instance of the student object by initializing the value
     * @param id : should be unique
     * @param name : name of the student it's a string
     * @param grade : grade of the student ( 1-12)
     */
     public Student(int id,String name,int grade){
         this.feesPaid=0;
         this.feesTotal=30_000;
         this.id=id;
         this.name=name;
         this.grade=grade;

     }
     //not going to alter student name and student's id they are locked features ,so no setters for them
    //use to update the student grade whenever he /she gets promoted to the next grade
    public void setGrade(int grade){
         this.grade=grade;

    }

    //update feesPaid
    public void setFeesPaid(int feesPaid){
         this.feesPaid+=feesPaid;
         School.updateTotalMoneyEraned(feesPaid);

    }


    //getters of the class
    public int getFeesPaid() {
        return feesPaid;
    }

    public String getName(){
         return name;
    }

    public int getGrade(){
         return grade;
    }
    public int remainingFees(){
         return feesTotal-feesPaid;
    }


}
