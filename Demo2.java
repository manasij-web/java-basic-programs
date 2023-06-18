package arraydemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter size for array:");
int size=sc.nextInt();

int[] arr=new int[size];
for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
	
	
}
//searching array
System.out.println("enter values:");
int x=sc.nextInt();
for(int j=0;j<arr.length;j++) {
	if(arr[j]==x) {
		System.out.println("number is found:"+j);
	}
	else {
		
	}
	
}
System.out.println("number is not in array");
	}

}
