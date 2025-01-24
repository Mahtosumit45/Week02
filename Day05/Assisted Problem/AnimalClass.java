import java.util.Scanner;
public class EmployeeManagementSystem{
	public static void main(String[] args){
	
	}
}

class Employee{
	protected String name;
	protected int id;
	protected double salary;
	Employee(String name, int id, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary
	}
	public void displayDetails(){
		System.out.println(this.name + this.age + this.salary);
	}
}
class Manager extends Employee{
	int teamSize;
	public Manager(String name, int age, double salary, int teamSize) {
       	super(name, age, salary, teamSize);
    }
}
class Developer extends Employee{
	String programingLanguage;
	public Developer(String name, int age, double salary, String programingLanguage) {
        super(name, age, salary, programingLanguage);
    }
}
class Intern extends Employee{
	int totalIntern;
	public Bird(String name, int age, double salary, int totalIntern) {
        super(name, age, salary, totalIntern);
    }
}