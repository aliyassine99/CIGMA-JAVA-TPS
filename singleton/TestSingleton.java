package ma.education.tp4.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Terre t1 = Terre.getInstance(2000, 200.44);
		Terre t2 = Terre.getInstance(6000, 700.6);
		
		System.out.println(t1.distanceToSoleil +" / "+ t1.surface);
		System.out.println(t2.distanceToSoleil +" / "+ t2.surface);

	}

}
