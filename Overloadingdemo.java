package methodandfunctions;

public class Overloadingdemo {
int age;
String name;
int a;
int b;
public void add(int age) {
	System.out.println(age);
	}
public void add(int age,String name) {
	System.out.println(name+":"+age);
}
public void add(int a,int b) {
	int c=a+b;
	System.out.println(c);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloadingdemo or=new Overloadingdemo();
or.a=12;
or.b=15;
or.age=22;
or.name="ganesh";

	}

}
