package keywords_usage;

public class Throws_keyword {
	public static int add1(int a,int b) throws ArithmeticException{
		int c=a/b;
		System.out.println("div:"+c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Throws_keyword.add(12, 15);
		try {
int div1=add1(13,0);
System.out.println("result:"+div1);
	
	}
	catch(Exception e) {
		System.out.println("Arithmetic e");
	}
}
}