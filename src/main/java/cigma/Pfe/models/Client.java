package cigma.pfe.models;

import javax.persistence.*;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column
	public String name;
	public Client(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Client() {
		
	}
	
	

}
