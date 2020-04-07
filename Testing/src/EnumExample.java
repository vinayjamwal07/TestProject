import java.util.EnumMap;
import java.util.Map;

public class EnumExample {
	
	public enum Num{
		ONE,TWO,THREE
	};
	
	public static void main (String [] args) {
		
		EnumMap<Num, Book> map = new EnumMap<Num, Book>(Num.class);  
		 
		Book book1= new Book(101,"Lets see", "Aurthr", "Penguin", 400);
		Book book2= new Book(102,"Monk with Ferrari", "John", "Nadrt", 1540);
		Book book3= new Book(103,"RDMS", "Sach", "GreenHill", 3224);
		
		map.put(Num.ONE,book1);
		map.put(Num.TWO, book2);
		map.put(Num.THREE,book3);
		
		for(Map.Entry<Num,Book>entry : map.entrySet()) {
			Book b=entry.getValue();
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
			
		}
		
		
		
	}

}
