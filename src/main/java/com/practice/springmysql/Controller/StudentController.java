package com.practice.springmysql.Controller;
import com.practice.springmysql.Model.Student;
import com.practice.springmysql.RespEnt;
import com.practice.springmysql.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/addStudents")
    public Student addStudent(@RequestBody Student students) {
        System.out.println("Student is Added.");
        return studentService.addStudent(students);
    }

    @GetMapping("/getStudents")
    public List<Student> getPolicy() {
        System.out.println("ListOfStudents: ");
        return studentService.getStudent();
    }

    @PutMapping("/editStudent")
    public ResponseEntity<RespEnt> editPolicy(@RequestBody Student student) {
        Student std = studentService.editStudent(student);
        RespEnt rspent = new RespEnt(std, "Updated Successfully");
        return new ResponseEntity<>(rspent, HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<RespEnt> deletePolicy(@RequestBody String student) {
        Student std = studentService.deleteStudent(student);
        RespEnt rspent = new RespEnt(std, "Deleted Successfully");
        return new ResponseEntity<>(rspent, HttpStatus.OK);
    }
}
