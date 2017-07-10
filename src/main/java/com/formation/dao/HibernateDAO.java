package com.formation.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.formation.domaine.Personne;

public class HibernateDAO implements Serializable {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
	EntityManager em = emf.createEntityManager();

	public List<Personne> personneListDao() {
		System.out.println("Debut DAO");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		List<Personne> personnes = new ArrayList<Personne>();

		Query query = em.createQuery(" Select c from Personne c ");
		personnes = query.getResultList();

		em.close();
		emf.close();
		System.out.println("Fin DAO");
		System.out.println("Lise personnes");

		return personnes;
	}

	public void addPersonne(Personne personne) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(personne);

		tx.commit();
		em.close();
		emf.close();
	}

	public void removePersonne(Personne personne) {
		// EntityTransaction tx = em.getTransaction();
		// tx.begin();
		// em.remove(em.merge(personne));
		// tx.commit();
		// EntityTransaction tx = em.getTransaction();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		System.out.println("RemovePersonne DAO");
		tx.begin();
		em.remove(em.merge(personne));
		tx.commit();
		em.close();
		 emf.close();
	}
}
