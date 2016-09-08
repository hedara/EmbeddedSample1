package com.samples.embedded.id.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by edara on 9/7/16.
 */
@Entity
@Table(name = "student")
public class Student {
    @EmbeddedId
    private Name name;
    @Column(name="grade")
    private String grade;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
