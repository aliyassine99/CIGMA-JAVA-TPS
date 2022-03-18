package cigma.pfe.dao;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientImpl {

    @PersistenceContext
    private EntityManager entitymanager;



    public Client save(Client p) {
       entitymanager.persist(p);
       return p;
    }

}
