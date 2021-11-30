package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Fournisseur;

public interface FournisseurRepository extends CrudRepository<Fournisseur, Long> {

}
