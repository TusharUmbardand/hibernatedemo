package com.tusha.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Arrays;

public class ManyToManyDemo {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Subject s1 = new Subject();
        s1.setId(1);
        s1.setName("java");
        s1.setDuration(90);

        Subject s2 = new Subject();
        s2.setId(2);
        s2.setName("SQL");
        s2.setDuration(15);

        Subject s3 = new Subject();
        s3.setId(3);
        s3.setName("HTML");
        s3.setDuration(7);

        Student  st1 = new Student();
        st1.setId(1);
        st1.setName("Tushar");
        st1.setSubjects(Arrays.asList(s1,s2));

        Student st2 = new Student();
        st2.setId(2);
        st2.setName("Mahi");
        st2.setSubjects(Arrays.asList(s2,s3));

        et.begin();
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        em.persist(st1);
        em.persist(st2);
        et.commit();

    }

}
