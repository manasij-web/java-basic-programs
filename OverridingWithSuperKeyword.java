package methodandfunctions;
class Demo{
	public void display() {
		System.out.println("parent calss");
	}
}
public class OverridingWithSuperKeyword extends Demo{
	public void display() {
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverridingWithSuperKeyword over=new OverridingWithSuperKeyword();
over.display();
	}

}
