package ma.education.tp1.introduction;

public class TestHeritage {

	public static void main(String[] args) {
		
		Salle s1= new SalleCours(1, "Salle 1", (byte) 20);
		SalleCours s2= new SalleCours(2, "Salle 2", (byte) 20);
		
		//L'instanciation de la ligne 3 car l'objet s1 �t� d�clar� Salle 
		//Le cast est valide pour la compatibilit� avec le type de la classe d�clar�
		SalleCours s3=(SalleCours)s1;
		SalleCours s4=s2;
		
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", (byte) 20);
		//L'instanciation de l'objet s7 car l'objet s5 
		//On utilise le cast pour sp�cifier la classe fille de la classe m�re
		SalleCours s7= (SalleCours)s5;
		SalleCours s8=s6;
		
	
		
		


	}

}
