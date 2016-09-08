package com.samples.embedded.id.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by edara on 9/6/16.
 */
@Embeddable
public class Name implements Serializable {
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

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Name){
            Name name = (Name) obj;
            if(name.firstName.equalsIgnoreCase(this.firstName) && name.lastName.equalsIgnoreCase(this.lastName)){
                return true;
            }
        }
        return false;
    }
}
