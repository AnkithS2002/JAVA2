import java.util.Scanner;

public class Employee extends Company{
	
	Scanner scan = new Scanner(System.in);
	public int age;
	
	Employee(){
		System.out.println("Enter Employee age: ");
		age = scan.nextInt();
	}
	
	void EmpEx() throws AgeLimitExceeded{
		if(age < 18 || age > 65) throw new AgeLimitExceeded(age);
	}
	
}

class AgeLimitExceeded extends Exception{
	
	int age;
	AgeLimitExceeded(int age){
		this.age = age;
	}
	
	public String toString() {
		if(age < 18) return("Age less than 18!");
		else return("Age greater than 65!");
	}
}