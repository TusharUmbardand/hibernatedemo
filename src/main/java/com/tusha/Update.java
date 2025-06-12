package com.tusha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Student s1 = em.find(Student.class,7);
        if(s1!=null){
            et.begin();;
            s1.setName("Raydu");
            em.merge(s1);
            et.commit();
            System.out.println("Record Updated");
        }else {
            System.out.println("No Student is present with given id");
        }
    }

}
