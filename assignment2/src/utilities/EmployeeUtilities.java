package utilities;

public class EmployeeUtilities {
	import com.yourname.assignment.employees.*;

	/**
	 * Utility class for Employee operations.
	 */
	public class EmployeeUtilities {

	    public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	        if (employee instanceof Manager) {
	            System.out.println("Department: " + ((Manager) employee).getDepartment());
	        } else if (employee instanceof Developer) {
	            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
	        }
	    }
	}

}
