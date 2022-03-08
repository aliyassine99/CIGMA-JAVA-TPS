package cigma.pfe.service;

import cigma.pfe.models.Client;
import cigma.pfe.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

		@Autowired
		private ClientDao clientDao ;

	@Override
	@Transactional
	public Client save(Client clt) {

		return clientDao.save(clt);
	}
	@Override
	@Transactional
	public Client update(Client newClt) {
		Client oldClt = clientDao.findById(newClt.getId()).get();
		oldClt.setName(newClt.getName());
		return clientDao.save(oldClt);
	}
	@Override
	@Transactional
	public void delete(long idClt) {

		clientDao.deleteById(idClt);
	}
	@Override
	public Client getOne(long idClt) {

		return clientDao.findById(idClt).get();
	}
	@Override
	public List<Client> getAll() {

		return (List<Client>) clientDao.findAll();
	}

}



	
