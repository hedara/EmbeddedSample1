package com.samples.embedded.multiple.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by edara on 9/6/16.
 */
@Embeddable
public class Name {
    @Column(name = "firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
