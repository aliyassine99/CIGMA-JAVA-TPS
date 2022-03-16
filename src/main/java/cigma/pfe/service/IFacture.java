package cigma.pfe.service;

import cigma.pfe.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class IFacture implements FactureService{
    @Autowired
    FactureService factureService;
    @Override
    @Transactional
    public Facture save(Facture f) {
        return factureService.save(f);
    }

    @Override
    @Transactional
    public Facture modify(Facture f) {
        return factureService.modify(f);
    }

    @Override
    @Transactional
    public Facture remove(long id) {
        return factureService.remove(id);
    }

    @Override
    public Facture getOne(long id) {
        return factureService.getOne(id);
    }

    @Override
    public List<Facture> getAll() {
        return factureService.getAll();
    }
}
