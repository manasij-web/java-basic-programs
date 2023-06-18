package keywords_usage;
class MyException extends Exception{
	public String checkName(String firstName,String lastName) throws Exception   {
		if(("firstName"+"lastName") == null){
			throw new Exception("error");
		}
		else
		{
			System.out.println("firstName"+"lastName");
		}
		return ("firstName"+"lastName");
	}	

}
public class SourceName {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//SourceName s=new SourceName();
	MyException m=new MyException();
	m.checkName("manasi", "jadhav");
	}
}
