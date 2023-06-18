package methodandfunctions;
class b{
	int a=10;
	void display() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);  //this keyword use for represent instances variables
	}
}
public class UsageOfThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b b=new b();
b.display();
	}

}
