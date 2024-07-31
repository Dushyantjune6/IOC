package org.Dependency_Injection.beans;

public class Teacher implements Staff{
    public Teacher() {
        System.out.println("Teacher bean created");
    }
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    Department department;
}
