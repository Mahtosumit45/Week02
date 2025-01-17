
import java.util.Scanner;
public class StudentClass {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String rollno = input.nextLine();
		int marks = input.nextInt();
		Student student = new Student(name, rollno, marks);
		student.Display();
	}
}

class Student {
	private String name;
	private String rollno;
	private int marks;

	public Student (String name, String rollno, int marks){
		this.name = name;
		this.rollno = rollno;
		this. marks = marks;
	}
	public String calculateGrade(){
		if(this.marks>90){
		return "A";
		}
		else if(this.marks>75){
		return "B";
		}
		else if(this.marks>50){
		return "C";
		}
		else if(this.marks>30){
		return "D";
		}
		else {
			return "Fail";
		}
	}

public void Display(){
		System.out.println("Student name - " +this.name);
		System.out.println("ROllno - " + this.rollno);
		System.out.println("marks scored - " + this.marks);
		System.out.println("Grade - " + this.calculateGrade());
	}
}