


//write your code here....

public class MobilePhone {
	public static void main(String[] args){
		Mobile mobile = new Mobile ("Samsung", "s24 Ultra", 120000);
		mobile.Display();
	}
}


class Mobile {
	private String brand;
	private String model;
	private int price;


	public Mobile( String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void Display(){
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);
	}
}