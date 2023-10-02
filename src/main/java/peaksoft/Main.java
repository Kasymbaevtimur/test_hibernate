package peaksoft;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import util.Util;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Timur", "Kasymbaev", "Peaksoft", "Offline");
//        create(student);
        System.out.println(getById(1L));


    }

    public static void create(Student student) {
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.persist(student);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added " + student.getName());
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }
    }

    public static Student getById(Long id) {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.getTransaction().commit();
        session.close();
        return student;
    }
}

