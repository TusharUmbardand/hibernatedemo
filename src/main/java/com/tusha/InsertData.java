package com.tusha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class InsertData {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar");
        EntityManager em = emf.createEntityManager();
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name");
        s1.setName(sc.nextLine());
        System.out.println("Enter roll Number");
        s1.setRollnumber(sc.nextInt());
        System.out.println("Enter email");
        s1.setEmail(sc.next());
        System.out.println("Enter height ");
        s1.setHeight(sc.nextDouble());
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(s1);
        et.commit();



    }

}
