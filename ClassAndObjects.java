package methodandfunctions;

public class ClassAndObjects {

	int id;
	String name;
	String city;
	
	public ClassAndObjects() {
		System.out.println("non parameterized constructor");
	}
	
	
	public void study() {
		System.out.println(name+"is studing");
	}
	public void alldetailas() {
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		System.out.println("city is"+city);
	}
}
