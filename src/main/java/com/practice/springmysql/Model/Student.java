package com.practice.springmysql.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue
    private int StudentID;
    @Column
    private String stdname;
    @Column
    private String Subject;
    @Column
    private int Fees;
}
