package ma.education.tp1.introduction;

public class Salle {

	  protected long id;
	  protected String nom;

	/*public Salle() {

	}*/

	public Salle(String nom) {

		this.nom = nom;
	}

	public Salle(long id, String nom) {
		this(nom);
		this.id = id;
	}
	
	void afficher() {
		System.out.println("Methodes");
	}
	

}
