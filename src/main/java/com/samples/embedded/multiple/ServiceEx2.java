package com.samples.embedded.multiple;

import com.samples.embedded.multiple.models.PhoneContact;
import com.samples.embedded.multiple.models.Contact;
import com.samples.embedded.multiple.models.Name;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by edara on 9/6/16.
 */
@Component
public class ServiceEx2 {
    @Autowired
    SessionFactory sessionFactory;

    public void run() {
        System.out.println("************************************ Method-1");
        addContact();
    }
    public void addContact(){
        Contact contact = sampleContactInfo();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(contact);
            transaction.commit();
        }catch (Exception ex){
            System.out.println(ex);
        }finally{
            session.close();
            if(transaction.isActive())
                transaction.commit();
        }


    }

    public Contact sampleContactInfo() {
        Contact contact = new Contact();
        Name name = new Name();
        name.setFirstName("Haree");
        name.setLastName("Edara");
        contact.setName(name);
        contact.setCompany_name("NYL");
        PhoneContact ph1 = new PhoneContact();
        ph1.setPhno("123-456-1111");
        PhoneContact ph2 = new PhoneContact();
        ph2.setPhno("234-456-0001");
        contact.setHomePhone(ph1);
        contact.setCellPhone(ph2);
        return contact;
    }
}
