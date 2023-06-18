package keywords_usage;

public class Arrayoutofbound_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String arr[]=new String[5];
	arr[0]="manasi";
	arr[1]="manasi";
	arr[2]="manasi";
	arr[3]="manasi";
	arr[4]="manasi";
	arr[5]="jija";
	arr[6]="jija";
	System.out.println(arr);
}
catch(Exception e){
	System.out.println(e);
}
	}

}
