package ma.education.tp2.reflection.rappel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		ResourceBundle rs = ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");

		String key1 = rs.getString("keyClass1");

		Class c = Class.forName(key1);

		Constructor[] constructors = c.getDeclaredConstructors();

		constructors[0].setAccessible(true);

		Object o = constructors[0].newInstance(null);
		
		Object o2= constructors[1].newInstance("Url","Nom","123");
		
		System.out.println(o2.toString());
		
		


	}

}
