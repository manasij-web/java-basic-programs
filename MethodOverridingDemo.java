package methodandfunctions;
class OverDemo{
	public String display(){
		
		return "manasi";
	}
}
public class MethodOverridingDemo extends OverDemo {
	public String display() {        //this child cls method override parent class properties
		return "m";                 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverridingDemo m=new MethodOverridingDemo();

System.out.println(m.display());

	}

}
