package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;


	public ClientController() {

	}

	@PostMapping("/add")
	public Client save(@RequestBody Client c ){

		return clientService.save(c);

}

	@PutMapping("/update")
	public Client update(@RequestBody Client c){
	return clientService.update(c);

}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long a){

		clientService.delete(a);
	}

	@GetMapping("/{id}")
		public Client getOne(@PathVariable("id") long id){

			return clientService.getOne(id);
	}


	@GetMapping("/all")
		public List<Client> getAll(){

			return clientService.getAll();
	}




}
