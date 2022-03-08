package cigma.pfe.dao;

import cigma.pfe.models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FactureDao extends JpaRepository<Facture,Long> {

}
