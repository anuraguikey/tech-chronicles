package com.sraglanstuds.backend;

public class DesignPatterns {

    public static void main(String[] args) {
       Student student = new Student(10,"Anurag",27);
       Student studentClone =(Student) student.clone();

    }


}
class Singleton{
    private static Singleton object;
    private Singleton(){}

    public static Singleton getInstance(){
        if(object==null){
            object =  new Singleton();
        }
        return object;
    }
}

interface Prototype{
    Prototype clone();
}

class Student implements Prototype{
    private int rollNumber;
    String name;
    int age;

    Student(){}

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(rollNumber,name,age);
    }
}

