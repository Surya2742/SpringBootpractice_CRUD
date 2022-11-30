package com.practice.springmysql.Services;

import com.practice.springmysql.Model.Student;
import com.practice.springmysql.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public List<Student> getStudent() {
        return repository.findAll();
    }
    public Student addStudent(Student student) {
        return repository.save(student);
    }
    public Student editStudent(Student student) {
        Student StudentToEdit = repository.findBystdname(student.getStdname());
        if(StudentToEdit != null ) {
            student.setStudentID(StudentToEdit.getStudentID());
            return repository.save(student);
        }
        return null;
    }
    public Student deleteStudent(String student) {
        Student studentToDelete = repository.findBystdname(student);
        if(studentToDelete != null) {
            repository.delete(studentToDelete);
            return studentToDelete;
        }
        return null;
    }

}
