package com.samples.embedded.id;

import com.samples.embedded.id.models.Student;
import com.samples.embedded.multiple.models.Contact;
import com.samples.embedded.id.models.Name;
import com.samples.embedded.multiple.models.PhoneContact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by edara on 9/6/16.
 */
@Component
public class ServiceEx3 {
    @Autowired
    SessionFactory sessionFactory;

    public void run() {
        System.out.println("************************************ Method-1");
        addStudent();
    }
    public void addStudent() {
        Name student_name = new Name();
        student_name.setLastName("Edara");
        student_name.setFirstName("Hareen");
        Student student = new Student();
        student.setName(student_name);
        student.setGrade("13");

        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        try{
            session.save(student);
            trans.commit();
        }catch(Exception ex) {
            System.out.println(ex);
        }finally{
            if(trans.isActive())
                trans.commit();
            session.close();
        }
    }

}
