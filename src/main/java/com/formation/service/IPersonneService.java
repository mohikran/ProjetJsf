package com.formation.service;

import java.util.List;

import com.formation.domaine.Personne;

public interface IPersonneService {

	List<Personne> getPersonneListDao();

	 void insertPersonne (Personne personne);
	 
	 void removePersonne(Personne personne);
}