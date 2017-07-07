package com.formation.domaine;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Personne {

		private String prenom;
		private int age;
		@Id
		private String nom;

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public Personne() {
			
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Personne(String nom, String prenom, int age) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}

		public Personne(String prenom) {
			super();
			this.prenom = prenom;
		}

		@Override
		public String toString() {
			return "Personne [prenom=" + prenom + ", age=" + age + ", nom=" + nom + "]";
		}
		
		
		
		
		}

	
	

