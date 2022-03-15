package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Class c = CalculatriceMath.class;
		
		
		Programmer programmer = (Programmer) c.getPackage().getAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());
		}


	

}
