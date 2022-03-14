package ma.education.tp1.introduction;

public class SalleCours extends Salle {
	
	byte nbrPlace;
	
	public SalleCours(long id, String nom, byte nbrPlace) {
		super(id, nom);
		this.nbrPlace = nbrPlace;
		}


}
