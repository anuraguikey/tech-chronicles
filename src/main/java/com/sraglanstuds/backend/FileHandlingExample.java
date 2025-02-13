package com.sraglanstuds.backend;

import java.io.*;

// Main class implementing Serializable
public class FileHandlingExample {

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, 50000, "John Doe");

        // Serialize the Employee object
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
            out.writeObject(emp);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Employee object
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));

            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("Employee object deserialized successfully.");
            System.out.println("ID: " + deserializedEmp.id);
            System.out.println("Salary: " + deserializedEmp.salary);
            System.out.println("Name: " + deserializedEmp.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Employee class implementing Serializable
    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L; // Recommended for versioning
        int id;
        int salary;
        String name;

        // Constructor
        public Employee(int id, int salary, String name) {
            this.id = id;
            this.salary = salary;
            this.name = name;
        }
    }
}

