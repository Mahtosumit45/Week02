

// write your code here....

public class ItemClass {
	public static void main(String[] args){
		item show = new item("0111Al211168", "Sumit", 1000);
		show.Display();
	}
}

class item {
	private String itemCode;
	private String itemName;
	private int price;


	public item (String itemCode, String itemName, int price){
			this.itemCode = itemCode;
			this.itemName = itemName;
			this.price = price;
		}
	
	public void Display(){
			System.out.println(this.itemCode);
			System.out.println(this.itemName);
			System.out.println(this.price);
		}
}
