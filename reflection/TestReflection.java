package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

import ma.education.tp1.introduction.Salle;

public class TestReflection extends Salle {

	
	

		

	public TestReflection(long id, String nom) {
		super(id, nom);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		ResourceBundle rs = ResourceBundle.getBundle("ma.education.tp2.reflection.params");
		String classValue = rs.getString("class1");
		Class c = Class.forName(classValue);
		 Field [] fields = c.getDeclaredFields();
		 
         for(Field f : fields) {
        	 
            System.out.println(f.getName());
         }
         
         Method[] methodes = c.getDeclaredMethods();
         
         for(Method m : methodes) {
        	 
             System.out.println(m.getName());
          }
         
         Constructor[] consts = c.getDeclaredConstructors();
        
         consts[0].newInstance();
         consts[1].newInstance("Salle informatique");
         consts[2].newInstance(2,"Salle cours");
         
         if(consts[2].equals(consts[3])) {
        	 System.out.println("Objects equal");
        	 
         }
         
         
         

	}

}
