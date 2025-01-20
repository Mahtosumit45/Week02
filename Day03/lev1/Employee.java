public class Employee {

    // Static variable
    private static String companyName = "ABC Company";

    // Final variable
    private final String EmployeeId;

	 	// Instance variables
    private String EmployeeName;

		public String EmployeeDesignation;


    // Constructor
    public Employee(String EmployeeName, String EmployeeId, String EmployeeDesignation) {
        this.EmployeeName = EmployeeName;
        this.EmployeeId = EmployeeId;
        this.EmployeeDesignation = EmployeeDesignation;  
    }
		 public static void displayCompanyName(){
			System.out.println("Company Name: " + companyName);
		}


    // Method to display Employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
			 System.out.println("Company Name: " + companyName);
			 System.out.println("Employee name: " + EmployeeName);
            System.out.println("Employee id: " + EmployeeId);
            System.out.println("Employee Designation: " + EmployeeDesignation);
        }
    }

    public static void main(String[] args) {
        // Creating Employee objects
        Employee employee1 = new Employee("Sumit kumar mahto ", "0111AL211168", "Manager");
        Employee employee2 = new Employee("Anshi Patel", "0199CS211041", "CEO");


       // Displaying Employee details
        employee1.displayEmployeeDetails();
		
        employee2.displayEmployeeDetails();


    }
}