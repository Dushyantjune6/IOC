package org.Dependency_Injection;

import org.Dependency_Injection.beans.Staff;
import org.Dependency_Injection.beans.Student;
import org.Dependency_Injection.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Student student = context.getBean("student");
        //Even after commenting this the student bean has been created due to eager loading of the ApplicationContext
        Teacher teacher = (Teacher) context.getBean("teacher");
        Staff teacher1 = context.getBean(Teacher.class);
        System.out.println(teacher.toString());

        Student dushyant = context.getBean(Student.class);
        System.out.println(dushyant.toString());



    }
}