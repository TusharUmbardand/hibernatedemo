package com.tusha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetOneRecord {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();

        Student s1 = em.find(Student.class,7);
        if(s1!=null){
            System.out.println(s1.toString());
        }else {
            System.out.println("No Student is present with given id");
        }

    }

}
