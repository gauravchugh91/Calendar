/*kavys= changes*/
/* ankesh changes*/
// Class Calendar is a placeholder for data and functions that helps to print the Calendar on Console for a particular year

public class Calendar {
	private int year;		//Holds the year entered by the user
	private int [] Month={31,28,31,30,31,30,31,31,30,31,30,31};	//Holds the number of days in a month
	private static String [] month={"January","February","March","April","May","June","July","August","September","October","November","December"};	//Holds the name of the months in a year
	
//		this.year=Integer.parseInt(year);

	
	//Checks for the Validity of the year and calls the print() function to print the Calendar if Year is Valid
	
	public void GenerateYear(String year){
			long totalDays;	// holds the number of days since 1/1/1 to previous year
			boolean checkDate=isValidYear(year);
			if(!checkDate)
				System.out.println("Invalid Date Entered, Please try again...");
			
			else{
				this.year=Integer.parseInt(year);
				totalDays=calculateDay(this.year-1)+1;
				int index=(int)totalDays%7;
				if(isLeapYear(this.year))
					Month[1]=29;
				print(index);
			}
		}
		
		//Check if the Year provided is a valid Year or not
		public boolean isLeapYear(int year){
			boolean isleap=((year%4==0 && year%100!=0) || (year%400==0));
			return isleap;
		}
		
		//Check if Date provided is a valid Date or not
		public static boolean isValidYear(String year){
			boolean check=true;
			for (char c : year.toCharArray())
		    {
		        if (!Character.isDigit(c)) 
		        	check= false;
		    }
			return check;
		}
		
		//Calculate the number of days since 1/1/1 to the 31st December of the previous year
		public long calculateDay(int year){
			long totalDays;
			totalDays=(year*365+year/4-year/100+year/400);
			return totalDays;
		}
		
		//Prints the Calendar in the appropriate format on Console
		public void print(int index){
			int i,j,k;
			for(i=0;i<12;i++){
				System.out.println("\n"+month[i]+", "+year);
				System.out.println("---------------------------------");
				System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");
				for(k=0;k<index;k++){
					System.out.print("     ");
				}
				
				for(j=1;j<=Month[i];j++){
					System.out.printf("%3d",j);
					System.out.print("  ");
					if((index+j)%7==0|| j==Month[i]){
						System.out.println("");
					}
				}
				index=(index+j-1)%7;
				
			}
		}
}