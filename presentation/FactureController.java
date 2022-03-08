package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FactureController {
    @Autowired
    FactureService factureService;

    public FactureController() {

    }

    public Facture save(Facture f ){

        return factureService.save(f);

    }

    public Facture modify(Facture f){
        return factureService.modify(f);

    }

    public void remove(long a){


        factureService.remove(a);
    }


    public Facture getOne(long id){
        return factureService.getOne(id);
    }

    public List<Facture> getAll(){
        return factureService.getAll();
    }


}
