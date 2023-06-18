package keywords_usage;

import java.util.Scanner;

class MyException extends Exception{
	public String toString() {
		return "i am toString";
	}
	public String getMessage() {
		return "i am getMessage";
	}
}
public class customize_exception_using_throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter any no:");
 a = sc.nextInt();
if(a<9) {
	try {
		throw new MyException();
	}
	catch(Exception e){
		System.out.println(e.toString());
		System.out.println(e.getMessage());
	}
}
	}

}
