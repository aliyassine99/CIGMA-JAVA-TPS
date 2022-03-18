package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller("ctrl1")
public class ClientController {

	@Autowired
	private ClientService clientService;


	public ClientController() {

	}

	public void save(Client person) {
		clientService.save(person);
	}




}
