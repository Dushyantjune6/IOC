package org.Dependency_Injection.beans;

public class Student implements Staff {

    public Student() {
        System.out.println("Student bean initialized");
    }
    String name;
    String className;
    Long RollNumber;

    public Long getRollNumber() {
        return RollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", RollNumber=" + RollNumber +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setRollNumber(Long rollNumber) {
        RollNumber = rollNumber;
    }
}
