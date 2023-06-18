package methodandfunctions;

public class ThisKeyword {
	int number;
	String pencil;
	public void getdata(int no,String nm) {
		System.out.println("demo method");
		System.out.println(no+":"+nm);
	}
	public void takedata() {
		number=this.number;
		pencil=this.pencil;
		System.out.println(number+":"+pencil);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword d=new ThisKeyword();
d.getdata(12, "aarushi");
d.takedata();

	}

}
