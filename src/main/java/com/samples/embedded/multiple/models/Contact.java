package com.samples.embedded.multiple.models;

import javax.persistence.*;

/**
 * Created by edara on 9/6/16.
 */
@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq_no;
    @Embedded
    private Name name;
    @Column(name = "company")
    private String company_name;
    @Embedded
    @AttributeOverrides(
            @AttributeOverride(
                    name = "phno",column = @Column(name = "home_phone")
            )
    )
    private PhoneContact homePhone;
    @Embedded
    @AttributeOverrides(
            @AttributeOverride(
                    name ="phno",column = @Column(name="cell_phone")
            )
    )
    private PhoneContact cellPhone;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public PhoneContact getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(PhoneContact homePhone) {
        this.homePhone = homePhone;
    }

    public PhoneContact getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(PhoneContact cellPhone) {
        this.cellPhone = cellPhone;
    }
}
