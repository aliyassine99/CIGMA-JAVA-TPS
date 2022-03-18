package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TClients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public Client(String name) {
		this.name = name;
	}

	@Column
	private String name;

	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
	List<Facture> factures;


	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"
	),
			inverseJoinColumns = @JoinColumn(
					name = "promotion_fk",
					referencedColumnName = "id"
			))

	@ManyToMany(cascade = CascadeType.PERSIST)
	List<Promotion> promotions;

	@OneToOne(cascade = CascadeType.PERSIST, mappedBy = "client")
	private CarteFidelio carteFidelio;

	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "client_adresse")
	private Adresse adresse;



	public Client(){

	}
	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}


}


