package methodandfunctions;

public class Student {
int age;
String position;
public void studentinfo() {
	System.out.println(this.age);
	System.out.println(this.position);
	//System.out.println(position+":"+age);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();

s.age=34;
s.position="monitor";
s.studentinfo();
	}

}
