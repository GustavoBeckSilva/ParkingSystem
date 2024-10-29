package com.mycompany.parkingsystem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.CinCout;
import model.OfficialCinCout;
import model.OfficialVehicle;
import model.Person;
import model.Vehicle;

public class ParkingSystem {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_parking_system");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person person = new Person();
        em.persist(person);

        Vehicle vehicle = new Vehicle();
        em.persist(vehicle);

        CinCout cinCout = new CinCout();
        em.persist(cinCout);

        OfficialVehicle officialVehicle = new OfficialVehicle();
        em.persist(officialVehicle);

        OfficialCinCout officialCinCout = new OfficialCinCout();
        em.persist(officialCinCout);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
