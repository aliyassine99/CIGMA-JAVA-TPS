package ma.education.tp1.horspack;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {


	public AccesHorsPackage(long id, String nom) {
		super(id, nom);
		
	}
	
	public void afficher(Salle s) {
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id);
		System.out.println(nom );
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salle s1 = new Salle(1, "Salle 2");
		
		System.out.println(afficher(s));

	}
	//Les attributes de type declaration "Protected" sont visible pour les classes de le meme package et les classes fille hors package

}
