package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import tn.esprit.spring.entities.Facture;
import  tn.esprit.spring.service.*;


@RestController
@RequestMapping("/facture")

public class FactureRestController {
	@Autowired
	FactureService FactureService;
	// http://localhost:8081/SpringMVC/facture/retrieve-all-factures
		@GetMapping("/retrieve-all-factures")
		@ResponseBody
		public List<Facture> getFactures() {
		List<Facture> list = FactureService.retrieveAllFacture();
		return list;

	}
		// http://localhost:8081/SpringMVC/facture/retrieve-facture/1
		@GetMapping("/retrieve-facture/{id}")
		@ResponseBody
		public Facture retrieveFacture(@PathVariable("id") Long id) {
		return FactureService.retrieveFacture(id);
		 }

		// http://localhost:8081/SpringMVC/facture/add-facture
		 @PostMapping("/add-facture")
		 @ResponseBody
		 public Facture addFacture(@RequestBody Facture f) {
			 Facture facture = FactureService.addFacture(f);
		 return facture;
	}
		 
			// http://localhost:8081/SpringMVC/facture/remove-facture/1
		 @DeleteMapping("/remove-facture/{id}")
		 @ResponseBody
		 public void deleteFacture(@PathVariable("id") Long id) {
			 FactureService.deleteFacture(id);
		 }
		// http://localhost:8081/SpringMVC/facture/modify-facture
		 @PutMapping("/modify-facture")
		 @ResponseBody
		 public Facture updateDetailFacture(@RequestBody Facture facture) {
		 return FactureService.updateFacture(facture);
		  }	

}
