package ma.cigma.controllers;

import lombok.val;
import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ClientController {


    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;




    @GetMapping(value = {"/", "/clients"})
    public String home(Model model) {
        model.addAttribute("client",new Client());
        List<Client> clients = restTemplate.getForObject(apiUrl+"/clients/all", List.class);
        model.addAttribute("clients",clients);
        return "index-client";
    }


    @PostMapping(value = "/add-client")
    public String AddClient(@ModelAttribute("client") Client client){

            restTemplate.postForObject(apiUrl + "/clients/add",client,Client.class);
            return "redirect:/clients";


    }


    @GetMapping(value = "/delete-client/{id}")
    public String deleteClientById(@PathVariable("id") long id){

        restTemplate.delete(apiUrl+ "/clients/delete/"+id);

        return "redirect:/clients";
    }

}
