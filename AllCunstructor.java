package methodandfunctions;

public class AllCunstructor {
	
	public AllCunstructor() {
		System.out.println("cunstrucutor made");//default cunstructor
	}
	
	public AllCunstructor(int age,String name) {//parameterised cunstructor
		System.out.println(age+":"+name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AllCunstructor a=new AllCunstructor();
AllCunstructor a1=new AllCunstructor(12, "manasi jadhav");
	}

}
