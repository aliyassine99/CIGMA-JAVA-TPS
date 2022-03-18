package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;


	public class ClientServiceImpl implements ClientService{
		
		public ClientServiceImpl() {
			System.out.println("Call Service ....");
			}

		ClientRepository clientRepository ;
		
		
		
		public void setClientRepository(ClientRepository clientRepository) {
			this.clientRepository = clientRepository;
		}



		public Client save(Client c) {
		System.out.println("Service Layer : ClientServiceImpl Level... ");
		return clientRepository.save(c);
		
		}

}



	
