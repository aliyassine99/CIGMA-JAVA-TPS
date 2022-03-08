package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String avenue ,ville, pays;





    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client_adresse;

    public Adresse(String avenue, String ville, String pays) {
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
    }

    public Adresse() {
    }
}
