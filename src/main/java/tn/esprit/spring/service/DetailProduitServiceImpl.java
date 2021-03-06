package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.DetailProduit;
import tn.esprit.spring.repository.DetailProduitRepository;
@Slf4j
@Service
public class DetailProduitServiceImpl implements DetailProduitService {

	@Autowired
	DetailProduitRepository detailProduitRepository ;
	@Override
	public List<DetailProduit> retrieveAllDetailProduit() {
		return (List<DetailProduit>) detailProduitRepository.findAll() ;
	}

	@Override
	public DetailProduit addDetailProduit(DetailProduit dp) {
		return detailProduitRepository.save(dp);
	}

	@Override
	public void deleteDetailProduit(Long idDetailProduit) {
		detailProduitRepository.deleteById(idDetailProduit);
		
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit dp) {
		return detailProduitRepository.save(dp);
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long idDetailProduit) {
		return detailProduitRepository.findById(idDetailProduit).get();
	}

	
}
