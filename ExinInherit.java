
public class ExinInherit {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		try {
			emp1.compEx();
		}catch(Not_Possible e) {
			System.out.println(e);
		}
		try {
			emp1.EmpEx();
		}
		catch(AgeLimitExceeded e1) {
			System.out.println(e1);
		}
	}

}
