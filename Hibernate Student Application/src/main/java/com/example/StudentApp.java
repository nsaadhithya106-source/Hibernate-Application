package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentApp {

    public static void main(String[] args) {

        Session session = null;
        Transaction transaction = null;

        try {

            session = HibernateUtil
                    .getSessionFactory()
                    .openSession();

            transaction = session.beginTransaction();

            // Create 10 Student objects
            Student s1 = new Student(
                    101,
                    "Arun Kumar",
                    "arun@gmail.com",
                    "Computer Science"
            );
            Student s2 = new Student(
                    102,
                    "Arun Kumar",
                    "arun@gmail.com",
                    "Computer Science"
            );
            Student s3 = new Student(
                    103,
                    "Arun Kumar",
                    "arun@gmail.com",
                    "Computer Science"
            );

            Student s4 = new Student(
                    104,
                    "Priya",
                    "priya@gmail.com",
                    "Artificial Intelligence"
            );

            Student s5 = new Student(
                    105,
                    "Rahul",
                    "rahul@gmail.com",
                    "Data Science"
            );

            Student s6 = new Student(
                    106,
                    "Divya",
                    "divya@gmail.com",
                    "Information Technology"
            );

            Student s7 = new Student(
                    107,
                    "Karthik",
                    "karthik@gmail.com",
                    "Cyber Security"
            );

            Student s8 = new Student(
                    108,
                    "Anitha",
                    "anitha@gmail.com",
                    "Artificial Intelligence and Data Science"
            );

            Student s9 = new Student(
                    109,
                    "Vignesh",
                    "vignesh@gmail.com",
                    "Computer Science"
            );

            Student s10 = new Student(
                    110,
                    "Sneha",
                    "sneha@gmail.com",
                    "Data Science"
            );

            Student s11 = new Student(
                    111,
                    "Harish",
                    "harish@gmail.com",
                    "Electronics and Communication"
            );

            Student s12 = new Student(
                    112,
                    "Meena",
                    "meena@gmail.com",
                    "Artificial Intelligence"
            );

            // Insert all students
            session.persist(s1);
            session.persist(s2);
            session.persist(s3);
            session.persist(s4);
            session.persist(s5);
            session.persist(s6);
            session.persist(s7);
            session.persist(s8);
            session.persist(s9);
            session.persist(s10);
            session.persist(s11);
            session.persist(s12);

            transaction.commit();

            System.out.println("======================================");
            System.out.println("10 Students inserted successfully!");
            System.out.println("======================================");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }
        }
    }
}