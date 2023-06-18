package keywords_usage;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
	public String toString() {
		return "radius can not be negative";
	}
	public String getMessage() {
		return "radius can not be 0";
	}
}
public class Negative_Throws {
	
     
	public static double area(double r)throws NegativeRadiusException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no:");
		r=sc.nextDouble();
		if(r<=0) {
			throw new NegativeRadiusException();
		}
	
		double res=Math.PI*r*r;
		return res;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double c=area(12);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}

}
