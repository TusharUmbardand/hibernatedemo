package com.tusha.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindOneToMany {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();

        Bank b1 = em.find(Bank.class,1);
        System.out.println(b1);
        for(Account account : b1.getAccounts())
        {
            System.out.println(account);
        }
    }
}
