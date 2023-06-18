package arraydemo;

import java.util.Arrays;

public class SecondSmallestNumberInArray {
public static int getsmallest(int [] arr,int total) {
	Arrays.sort(arr);
	return arr[1];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,56,43,1,23,6};
System.out.println(getsmallest(arr, 6));
	}

}
