package cigma.pfe.service;

import cigma.pfe.dao.ClientImpl;
import cigma.pfe.models.Client;
import cigma.pfe.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{



		@Autowired
		private ClientImpl dao;
		public ClientServiceImpl() {
			System.out.println("creation bean service");
		}

	@Override
	public Client save(Client c) {
		dao.save(c);
		return null;
	}

}



	
