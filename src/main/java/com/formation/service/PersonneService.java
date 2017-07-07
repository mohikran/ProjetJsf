package com.formation.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.formation.dao.HibernateDAO;
import com.formation.dao.IPersonneDAO;
import com.formation.domaine.Personne;

@Named
@SessionScoped
public class PersonneService  implements Serializable, IPersonneService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@Inject
	//IPersonneDAO personneDAO;
	
	@Inject
	HibernateDAO hibDAO;

	/* (non-Javadoc)
	 * @see org.jboss.as.quickstarts.numberguess.IPersonneService#personnelist()
	 */
	public List<Personne> getPersonneListDao(){
		//return personneDAO.personnelist();
		return hibDAO.personneListDao();
		
		
	}

	}
	
	
	
	

