package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	ClientService ClientService;
	// http://localhost:8081/SpringMVC/client/retrieve-all-clients
		@GetMapping("/retrieve-all-clients")
		@ResponseBody
		public List<Client> getClients() {
		List<Client> list = ClientService.retrieveAllClient();
		return list;

	}

		// http://localhost:8081/SpringMVC/client/addClient
		 @PostMapping("/addClient")
		 @ResponseBody
		 public Client addClient(@RequestBody Client f) {
			 Client Client = ClientService.addClient(f);
		 return Client;
	}
		 
		// http://localhost:8081/SpringMVC/client/remove-client/1
				 @DeleteMapping("/remove-client/{id}")
				 @ResponseBody
				 public void deleteClient(@PathVariable("id") Long id) {
					 ClientService.deleteClient(id);
				 }	 
		 
		 
		 
		 
		 
		 
		 
		 
		
}
