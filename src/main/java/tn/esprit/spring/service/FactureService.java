package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Facture;

public interface FactureService {

	public List<Facture> retrieveAllFacture() ;


	public Facture addFacture(Facture f);
	public void deleteFacture(Long id);
	
	public Facture updateFacture(Facture f);
	
	public Facture retrieveFacture(Long id);
}