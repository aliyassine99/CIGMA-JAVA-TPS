package cigma.pfe.service;

import cigma.pfe.models.Client;

import java.util.List;

public interface ClientService {

	Client save(Client clt);
	Client update(Client clt);
	void delete(long idClt);
	Client getOne(long idClt);
	List<Client> getAll();

}
