package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;


    @JoinTable(name="my_join_table_produit_promotion",joinColumns = @JoinColumn(
            name = "produit_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "facture_fk",
                    referencedColumnName = "id"
            ))
    @ManyToMany(cascade = CascadeType.PERSIST)
    List<Facture> factures;




    public Produit(String name, double price) {
        this.name = name;}}
