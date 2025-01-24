import java.util.Scanner;
public class AnimalClass{
	public static void main(String[] args){
		Animal dog = new Dog("Dog",2);
		dog.makeSound();
		Animal cat = new Cat("Cat",3);
		cat.makeSound();
		Animal bird = new Bird("Bird",3);
		bird.makeSound();
	}
}

class Animal{
	private String name;
	private int age;
	Animal(String name, int age){
		this.name = name;
		this.age =age;
	}
	public void makeSound(){
		System.out.println("Animal makes sound ");
	}
}
class Dog extends Animal{
	public Dog(String name, int age) {
        super(name, age);
    }
	public void makeSound(){
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	public Cat(String name, int age) {
        super(name, age);
    }
	public void makeSound(){
		System.out.println("Cog meow");
	}
}
class Bird extends Animal{
	public Bird(String name, int age) {
        super(name, age);
    }
	public void makeSound(){
		System.out.println("Bird chirps");
	}
}