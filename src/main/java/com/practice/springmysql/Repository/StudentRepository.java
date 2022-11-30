package com.practice.springmysql.Repository;

import com.practice.springmysql.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findBystdname(String Name);

}
