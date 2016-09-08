package com.samples.embedded.simple;

import com.samples.embedded.simple.models.Contact;
import com.samples.embedded.simple.models.Name;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by edara on 9/6/16.
 */
@Component
public class ServiceEx1 {
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
        return contact;
    }
}
