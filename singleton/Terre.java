package ma.education.tp4.singleton;

public class Terre {
	
	double distanceToSoleil;
	double surface;
	private static Terre instance;
	
	
	
	public Terre(double distanceToSoleil, double surface) {
		super();
		this.distanceToSoleil = distanceToSoleil;
		this.surface = surface;
	}



	public static Terre getInstance(double distance , double surface) {
		
		if(instance == null) 
			instance = new Terre(distance, surface);
		
		
		return instance;
	}
	
	

}
