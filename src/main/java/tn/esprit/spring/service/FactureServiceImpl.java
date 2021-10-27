package tn.esprit.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repository.FactureRepository;

@Service
public class FactureServiceImpl implements FactureService{

	@Autowired
	FactureRepository FactureRepository ;
	
	@Override
	public List<Facture> retrieveAllFacture() {
		return (List<Facture>) FactureRepository.findAll();
	}

	@Override
	public Facture addFacture(Facture f) {
		return FactureRepository.save(f);
	}

	@Override
	public void deleteFacture(Long id) {
		FactureRepository.deleteById(id);		
	}

	@Override
	public Facture updateFacture(Facture f) {
		return FactureRepository.save(f);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return FactureRepository.findById(id).get();
	}

}
