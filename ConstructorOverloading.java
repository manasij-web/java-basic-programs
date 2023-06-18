package methodandfunctions;
class DemoNew{
	public DemoNew(){
		System.out.println("default constructor");
	}
	public DemoNew(int a){
		System.out.println(a);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ConstructorOverloading co=new ConstructorOverloading();
		DemoNew obj=new DemoNew();
		DemoNew obj1=new DemoNew(10);
	}

}
