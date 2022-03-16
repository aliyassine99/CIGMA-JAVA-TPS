package cigma.pfe.service;

import cigma.pfe.models.Facture;

import java.util.List;

public interface FactureService {

     Facture save(Facture f);
     Facture modify(Facture f);
     Facture remove(long id);
     Facture getOne(long id);
     List<Facture> getAll();

}
