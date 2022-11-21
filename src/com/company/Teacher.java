package com.company;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id,String name ,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

}
