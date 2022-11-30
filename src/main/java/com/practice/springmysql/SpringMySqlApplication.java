package com.practice.springmysql;

import com.practice.springmysql.Model.Student;
import com.practice.springmysql.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringMySqlApplication {

    @Autowired
    StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMySqlApplication.class, args);
    }

    @PostConstruct
    public void addData() {
        Student student = new Student(1, "Surya", "Marathi", 3200);
        studentService.addStudent(student);
        Student student2 = new Student(2, "Raju", "Maths", 4000);
        studentService.addStudent(student2);

    }
}
