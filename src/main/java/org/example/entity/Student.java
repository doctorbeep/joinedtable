package org.example.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends Person {

    private String major;

    public Student() {}

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
}
