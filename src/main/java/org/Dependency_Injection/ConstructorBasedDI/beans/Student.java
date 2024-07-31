package org.Dependency_Injection.ConstructorBasedDI.beans;

public class Student {
    String name;
    String className;

    public String getName() {
        return name;
    }

    public Student(String className, String name) {
        this.className = className;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
