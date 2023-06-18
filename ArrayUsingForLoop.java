package arraydemo;
import java.lang.reflect.Array;
public class ArrayUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []m1={"manasi","ganesh","prapti","isra","shraddha"};

for(int i=0;i<m1.length;i++) {   //it will fetch all string values in array
	System.out.print(m1[i]);
}
int [] m2= {2,3,4,56,67,77};
for(int i=0; i<m2.length; i++) {    //it will fetch all elements in array
	System.out.println(m2[i]);
}
for(int i=m2.length-1; i>=0; i--) {    //it will fetch all elements in array in reverse order
	System.out.println(m2[i]);
}

int [] m3= {2,3,4,56,67};
for(int i=m3.length-1; i>=0; i--) {    //it will fetch all elements in array in reverse order
	System.out.print(m3[i]);
}

	}

}
