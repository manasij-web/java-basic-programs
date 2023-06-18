package arraydemo;

import java.util.Scanner;

public class Demo {
public static void main(String []manasi) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int size=sc.nextInt();
int[] num=new int[size];
//this for loop for input 
for(int i=0;i<num.length;i++) {
	num[i]=sc.nextInt();
	System.out.println(num[i]);
}
//this for loop for output
for(int i=0;i<num.length;i++) {
	System.out.println(num[i]);	
}

}
}
