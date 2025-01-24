import java.util.Scanner;
public class AnimalClass{
	public static void main(String[] args){
		Animal dog = new Dog("Husky",2);
		dog.makeSound();
		Animal cat = new Cat("Kitty",3);
		cat.makeSound();
		Animal bird = new Bird("Sweety",3);
		bird.makeSound();
	}
}

class Animal{
	protected String name;
	protected int age;
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
		System.out.println(name+" barks");
	}
}
class Cat extends Animal{
	public Cat(String name, int age) {
        super(name, age);
    }
	public void makeSound(){
		System.out.println(name+" meow");
	}
}
class Bird extends Animal{
	public Bird(String name, int age) {
        super(name, age);
    }
	public void makeSound(){
		System.out.println(name+" chirps");
	}
}