package org.Dependency_Injection.ConstructorBasedDI;

import org.Dependency_Injection.ConstructorBasedDI.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorBasedSpring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
