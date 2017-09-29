package de.wgu.marky.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MarkyMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("marky");

    }
}
