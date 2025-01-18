import java.util.Scanner;

public class CircleClass{
	public static void main(String[] args){
  //creating scanner for users input
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
   System.out.println("Area of circle with default radius is ");
  		double area1 = circle.calculateArea(); //calling area with default radius
    System.out.println(area1);
		int radius = sc.nextInt();
		Circle circle1 = new Circle(radius);
   System.out.println("Area of circle by users input radius is ");
		double area2 = circle1.calculateArea();// calling area with users input radius
System.out.println(area2);
      
	}
}

class Circle{
	private int radius;
	public Circle(){
		this.radius = 7;
	}
	public Circle(int radius){
		this.radius = radius;
	}
 	public double calculateArea(){
		double area = Math.PI*Math.pow(radius,2);
return area;
	}
}
