import java.util.Scanner;

public class Company {
	
	Scanner scan = new Scanner(System.in);
	public int year;
	
	Company(){
		System.out.println("Enter the year of joining: ");
		year = scan.nextInt();
	}
	void compEx() throws Not_Possible{
		if(year < 2005) throw new Not_Possible();
	}
}

class Not_Possible extends Exception{
	public String toString() {
		return("Company started in 2005!");
	}
}