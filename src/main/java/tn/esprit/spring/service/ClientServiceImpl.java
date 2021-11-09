package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.DetailFacture;
import tn.esprit.spring.repository.ClientRepository;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository ClientRepository ;
	@Override
	public List<Client> retrieveAllClient() {
		return (List<Client>) ClientRepository.findAll();
	}

	@Override
	public Client addClient(Client d) {
		return ClientRepository.save(d);
	}

	@Override
	public void deleteClient(Long id) {
	ClientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client d) {
		return ClientRepository.save(d);
	}

	@Override
	public Client retrieveClient(Long id) {
		return ClientRepository.findById(id).get();
	}

}
