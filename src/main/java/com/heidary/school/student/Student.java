package com.heidary.school.student;

import java.time.LocalDate;

public class Student {
    //fields
    private Long id;
    private String fName;
    private String lName;
    private String email;
    private LocalDate dob;
    private Integer age;

    //Constructors

    public Student() {
    }

    public Student(Long id, String fName, String lName, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String fName, String lName, String email, LocalDate dob, Integer age) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    //Getter and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //To String method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
