package methodandfunctions;
class A{
	public void display() {
		System.out.println("method overloading");
	}
	public int display(int a,int b) {
		System.out.println("addition is:"+(a+b));
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.display();
a.display(10, 15);
	}

}
