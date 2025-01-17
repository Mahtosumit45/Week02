


//write your code here.....

public class BookClass {
public static void main(String[] args){
   Book book = new Book("Anshi the great", "Anshi patel" , 1000000);
    book.Display();

}

}

class Book {
  private String title;

private String author;
private int price;

public Book (String title,String author,int price){
    this.title =title;
this.author = author;
this.price =price;

}

public  void Display(){
   System.out.println(this.title);

System.out.println(this.author);
System.out.println(this.price);

} 



}