package com.formation.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.formation.domaine.Personne;

public class PersonneDAO implements Serializable, IPersonneDAO{

	/* (non-Javadoc)
	 * @see org.jboss.as.quickstarts.numberguess.IPersonneDAO#personnelist()
	 */
	@Override
	public List<Personne> personnelist() {
		System.out.println("Debut personnelist Service");

		ArrayList<Personne> listePersonness = new ArrayList<Personne>();
		Personne personne1 = new Personne("Alexandre", "Piccini", 25);
		Personne personne2 = new Personne("Ju", "Das", 58);
		Personne personne3 = new Personne("Je", "Sus", 48);
		Personne personne4 = new Personne("Jean", "Pierre", 59);

		listePersonness.add(personne1);
		listePersonness.add(personne2);
		listePersonness.add(personne3);
		listePersonness.add(personne4);

		System.out.println("Fin methodeService" + listePersonness);

		return listePersonness;

	}
}
