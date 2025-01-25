package EmployeeManagement;

public class EmployeeManagementSystem{
	public static void main(String[] args){
	Employee manager = new Manager("Sumit", 101, 120000, 11);
	Employee developer = new Developer("Anshi", 1011, 90000, "java");
	Employee intern = new Intern("kumar", 1003, 70000, 2023);

	manager.displayDetails();
	developer.displayDetails();
	intern.displayDetails();
	}
}

class Employee{
	protected String name;
	protected int id;
	protected double salary;
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails(){
		System.out.println("Name : " + name + ", ID : " + id + ", Salary : "+salary);
	}
}
class Manager extends Employee{
	private int teamSize;
	public Manager(String name, int id, double salary, int teamSize) {
       	super(name, id, salary);
		this.teamSize = teamSize;
    }
 @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: EmployeeManagement.Manager, Team Size: " + teamSize);
    }
}
class Developer extends Employee{
	private String pLanguage;
	public Developer(String name, int id, double salary, String pLanguage) {
        super(name, id, salary);
		 this.pLanguage = pLanguage;
    }
	 @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: EmployeeManagement.Developer, Programming Language: " + pLanguage);
    }
}
class Intern extends Employee{
	private int joinYear;
	public Intern(String name, int id, double salary, int joinYear) {
        super(name, id, salary);
		this.joinYear = joinYear;
    }
 @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: EmployeeManagement.Intern, Join Year: " + joinYear);
    }
}