package com.formation.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.formation.domaine.Personne;
import com.formation.service.IPersonneService;

@Named
@SessionScoped
public class PersonneBeans implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Personne personne;
	
	
	//public List<Personne> ListePersonne;
	
	//PersonneService pServ;
	
	@Inject
	IPersonneService pServ2;


	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public PersonneBeans() {
		personne = new Personne();
	}

	public String affichage() {
		System.out.println("Voici les informations :\n  " + personne.getNom() + "\n \n" + personne.getPrenom() + "\n \n"
				+ personne.getAge());
		return "page3";
	}

	
	
	public String getTapperIci() {
		// System.out.println("Debut de la methode");
		// System.out.println(personne.getPrenom());

		if ("".equals(personne.getPrenom()) || personne.getPrenom() == null) {
			return "";
		} else {
			return "Ajax message : Welcome " + personne.getPrenom();
		}

	}
	//@PostConstruct
	public String affichageListePersonnes() {
		System.out.println("Debut de la affichageliste");

		//PersonneService pServ = new PersonneService();
		//pServ.personnelist();
		System.out.println("Fin affichage liste");
		return "page4";
	}

	
	public List<Personne> getListePersonne() {
		System.out.println("Debut de la getListePersonne");
		//PersonneService pServ2 = new PersonneService();
		List<Personne> ListePersonne = pServ2.getPersonneListDao();
		return ListePersonne;

	} 
	
	

}
