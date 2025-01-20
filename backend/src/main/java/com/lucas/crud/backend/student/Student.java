package com.lucas.crud.backend.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private int id;
    private String name;
    private int age;
    private LocalDate birthday;
    private String email;

    public Student(){

    }

    public Student(int id, String name, int age, LocalDate birthday, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

    public Student(String name, int age, LocalDate birthday, String email) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
