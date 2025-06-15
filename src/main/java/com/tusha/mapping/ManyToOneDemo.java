package com.tusha.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ManyToOneDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Product p1 = new Product();
        p1.setName("Mobile");
        p1.setId(1);
        p1.setCost(20000);

        Review r1 = new Review();
        r1.setId(1);
        r1.setHeading("Good");
        r1.setMessage("Nice to take pics");
        r1.setProduct(p1);

        Review r2 = new Review();
        r2.setId(2);
        r2.setHeading("Not satisfied");
        r2.setMessage("Heating issues");
        r2.setProduct(p1);

        et.begin();;

        em.persist(r1);
        em.persist(r2);
       em.persist(p1);
        et.commit();


    }
}
