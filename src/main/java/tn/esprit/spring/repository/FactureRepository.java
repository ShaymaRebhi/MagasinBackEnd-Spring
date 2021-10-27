package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Facture;

public interface FactureRepository extends CrudRepository<Facture,Long> {
    @Modifying
    @Query("update Facture f set f.active = :active where f.idFacture =:idFacture")
    int annulerFacture(@Param("active")Boolean active, @Param("idFacture") Long idFacture);
}

