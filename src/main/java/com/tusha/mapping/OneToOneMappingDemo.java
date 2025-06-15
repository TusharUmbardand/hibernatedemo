package com.tusha.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class OneToOneMappingDemo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tushar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        Car car = new Car();
        car.setId(1);
        car.setName("TATA");

        Engine engine = new Engine();
        engine.setId(1);
        engine.setType("v4");
        engine.setPower("120hp");
        car.setEngine(engine);

        et.begin();;
        entityManager.persist(engine);
        entityManager.persist(car);
        et.commit();

    }
}
