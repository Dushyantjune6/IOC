package org.Dependency_Injection.beans;

public class Department {
    Long strength;

    public Long getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Department{" +
                "strength=" + strength +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public void setStrength(Long strength) {
        this.strength = strength;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    String departmentName;

}
