package com.samples.embedded.multiple.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by edara on 9/6/16.
 */
@Embeddable
public class PhoneContact {
    private String phno;


    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

}
