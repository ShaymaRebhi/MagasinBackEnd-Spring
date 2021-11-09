package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Client;

public interface ClientService {
	public List<Client> retrieveAllClient();
	public Client addClient(Client d) ;
	public void deleteClient(Long id);
	public Client updateClient(Client d);
	public Client retrieveClient(Long id) ;
}
