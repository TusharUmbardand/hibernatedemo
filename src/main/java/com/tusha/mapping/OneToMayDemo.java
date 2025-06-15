package com.tusha.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Arrays;

public class OneToMayDemo {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Account ac1 = new Account();
        ac1.setId(1);
        ac1.setName("Tushar");
        ac1.setAccountNumber(12345);

        Account ac2 = new Account();
        ac2.setId(2);
        ac2.setName("Mahi");
        ac2.setAccountNumber(7777);

        Bank b1 = new Bank();
        b1 .setName("SBI");
        b1.setId(1);
        b1.setIfsc("SBI00001");

        b1.setAccounts(Arrays.asList(ac1,ac2));


        et.begin();;

        em.persist(b1);
        em.persist(ac1);
        em.persist(ac2);
        et.commit();




    }
}
