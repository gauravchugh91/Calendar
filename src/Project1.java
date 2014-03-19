
// Main Class of the Project
public class Project1 {
	public static void main(String[] args) {
		try{
			Calendar cal=new Calendar();
			cal.GenerateYear(args[0]);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("\n\nSupply the Appropriate Command Line Arguments");
		}
	}
}
