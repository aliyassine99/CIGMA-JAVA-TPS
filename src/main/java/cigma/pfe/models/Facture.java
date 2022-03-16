package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@ToString
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private double amount;

    @Column
    private String description;
    public Facture() {

    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;







    public Facture(double amount, String description) {
        this.amount= amount;
        this.description=description;
    }
}
