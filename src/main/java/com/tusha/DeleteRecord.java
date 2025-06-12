package com.tusha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteRecord {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Student s1 = em.find(Student.class,7);
        if(s1!=null){
            et.begin();
            em.remove(s1);
            et.commit();
            System.out.println("Student deleted");
        }else {
            System.out.println("No Student is present with given id");
        }
    }
}
