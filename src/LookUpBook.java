import java.util.ArrayList;
import java.util.Scanner;


public class LookUpBook {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static boolean b = true;
	
	static boolean p;
	
	static boolean found; 
	
	static int x;
	
	static double y;
	
	static double z;
	
	static String choice;
	
	static char letter = 'y';
	
	static int index;
	
	static ArrayList<String> isbnInfo = BookInfo.getIsbnInfo();
	static ArrayList<String> titleInfo = BookInfo.getTitleInfo();
	static ArrayList<String> authorInfo = BookInfo.getAuthorInfo();
	static ArrayList<String> publisherInfo = BookInfo.getPublisherInfo();
	static ArrayList<String> dateAddedInfo = BookInfo.getDateAddedInfo();
	static ArrayList<Integer> qtyOnHandInfo = BookInfo.getQtyOnHandInfo();
	static ArrayList<Double> wholesaleInfo = BookInfo.getWholesaleInfo();
	static ArrayList<Double> retailInfo = BookInfo.getRetailInfo();
	
	public static void printLookUpBook(int index){
		
		System.out.println("+------------------------------------------+");
		System.out.printf("|                Book # %d                  |\n", (index + 1));
		System.out.println("+------------------------------------------+");
		System.out.println("ISBN: " + isbnInfo.get(index));
		System.out.println("Title: " + titleInfo.get(index));
		System.out.println("Author: " + authorInfo.get(index));
		System.out.println("Publisher: " + publisherInfo.get(index));
		System.out.println("Date Added (MM/DD/YYYY): " + dateAddedInfo.get(index));
		System.out.println("Quantity-On-Hand: " + qtyOnHandInfo.get(index));
		System.out.printf("Wholesale Cost: $ %6.2f\n", wholesaleInfo.get(index));
		System.out.printf("Retail Cost: $ %6.2f\n", retailInfo.get(index));
		System.out.println();
		
	}
	
	public static void lookUpBook(){
		
		System.out.println();
		System.out.println("+-----------------------------+");
		System.out.println("| You Selected Look Up a Book |");
		System.out.println("+-----------------------------+");
		System.out.println();
		
		System.out.println();
		System.out.println("+---------------------------------------+");
		System.out.println("| Search for a book by:                 |");
		System.out.println("|  1. ISBN number                       |");
		System.out.println("|  2. Book Title                        |");
		System.out.println("|  3. Author's name                     |");
		System.out.println("|  4. Publisher's name                  |");
		System.out.println("|  5. Return to the Inventory Database  |");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		int k = 0;
		
		while(k != 5){
			
			do{
				
				System.out.print("Enter your choice: ");
				choice = keyboard.nextLine();
				System.out.println();
				p = true;
					
				try {
					
					k = Integer.parseInt(choice);
					
				}
					
				catch(NumberFormatException nFE) {
					
					p = false;
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
					System.out.println("--------------------------------------------------------");
					System.out.println();
					
				}
						
			}while(b == false);
				
			if(k == 1){
				
				System.out.println();
				System.out.println("+------------------------------------+");
				System.out.println("| You Selected Search by ISBN number |");
				System.out.println("+------------------------------------+");
				System.out.println();
				
				System.out.print("Enter ISBN number: ");
				String isbn = keyboard.nextLine();
				System.out.println();
				
				if(isbnInfo.contains(isbn)){
					 
					int index = isbnInfo.indexOf(isbn);
					
					System.out.println("Results:");
					System.out.println("+------------------------------------------+");
					System.out.printf("|                Book # %d                  |\n", (index + 1));
					System.out.println("+------------------------------------------+");
					System.out.println("ISBN: " + isbnInfo.get(index));
					System.out.println("Title: " + titleInfo.get(index));
					System.out.println("Author: " + authorInfo.get(index));
					System.out.println("Publisher: " + publisherInfo.get(index));
					System.out.println("Date Added (MM/DD/YYYY): " + dateAddedInfo.get(index));
					System.out.println("Quantity-On-Hand: " + qtyOnHandInfo.get(index));
					System.out.printf("Wholesale Cost: $ %6.2f\n", wholesaleInfo.get(index));
					System.out.printf("Retail Cost: $ %6.2f\n", retailInfo.get(index));
					System.out.println();

				}
				
				else{
					
					System.out.printf("The book containing \" %s \" ISBN is not in the inventory!\n", isbn);
					
				}
				
			}
			
			else if(k == 2){
				
				System.out.println();
				System.out.println("+----------------------------------------+");
				System.out.println("|  You Selected Search by the Book Title |");
				System.out.println("+----------------------------------------+");
				System.out.println();
				
				System.out.print("Enter Book Title: ");
				String title = keyboard.nextLine();
				System.out.println();
				
				String [] titles = titleInfo.toArray(new String[titleInfo.size()]);
				
				System.out.println();
				System.out.println("+-------------------+");
				System.out.println("| Search Results    |");
				System.out.println("+-------------------+");
				System.out.println();
				
				int count = 0;
				
				for(int i = 0; i < titles.length; i ++){
					
					if(titles[i].toLowerCase().equals(title.toLowerCase())){
						
						found = true;
						
						if(found){
						
							printLookUpBook(i);
							count++;
							
						}
						
					}
				
				}
				
				System.out.println();
				
				System.out.printf("There are %d items found!\n", count);
				
				if(count == 0){
					
					System.out.printf("The book containing \" %s \" title is not in the inventory!\n", title);
				
				}
				
				//containing parts
				
				count = 0;
				
				System.out.println();
				System.out.println("+---------------------+");
				System.out.println("| Similar Matches     |");
				System.out.println("+---------------------+");
				System.out.println();
				
				for(int i = 0; i < titles.length; i ++){
						
					boolean fullContainsSub = titles[i].toLowerCase().indexOf(title.toLowerCase()) != -1;
						
					if(fullContainsSub){
						
						count++;

						printLookUpBook(i);
						
					}
				}
				
				System.out.printf("There are %d books containing \" %s \" in the title! \n", count, title);
				
				if(count == 0){
					
					System.out.printf("There are %d  occurences of the title \" %s \" in the inventory!\n", count, title);
				
				}
				
				System.out.println("\nThe Search is Complete!");
				
			}		
				
			else if(k == 3){
				
				System.out.println();
				System.out.println("+------------------------------------------+");
				System.out.println("| You Selected Search by the Author's name |");
				System.out.println("+------------------------------------------+");
				System.out.println();
				
				System.out.print("Enter Author's Name: ");
				String author = keyboard.nextLine();
				System.out.println();
				
				
				if(authorInfo.toString().equalsIgnoreCase(author)){
					
					int index = authorInfo.indexOf(author);
					
					System.out.println("+---------------------------------+");
					System.out.println("| You Selected Inventory Listing  |");
					System.out.println("+---------------------------------+");
					System.out.println();
					
					System.out.println();
					System.out.println("+------------------------------------------+");
					System.out.printf("|                Book # %d                  |\n", (index + 1));
					System.out.println("+------------------------------------------+");
					System.out.println("ISBN: " + isbnInfo.get(index));
					System.out.println("Title: " + titleInfo.get(index));
					System.out.println("Author: " + authorInfo.get(index));
					System.out.println("Publisher: " + publisherInfo.get(index));
					System.out.println("Date Added (MM/DD/YYYY): " + dateAddedInfo.get(index));
					System.out.println("Quantity-On-Hand: " + qtyOnHandInfo.get(index));
					System.out.printf("Wholesale Cost: $ %6.2f\n", wholesaleInfo.get(index));
					System.out.printf("Retail Cost: $ %6.2f\n", retailInfo.get(index));
					System.out.println();

				}
				
				else{
					
					System.out.printf("The book containing \" %s \" author is not in the inventory!\n", author);
					
				}
				
			}
				
			else if(k == 4){
	
				System.out.println();
				System.out.println("+---------------------------------------------+");
				System.out.println("| You Selected Search by the Publisher's name |");
				System.out.println("+---------------------------------------------+");
				System.out.println();
				
				System.out.print("Enter Publisher's Name: ");
				String publisher = keyboard.nextLine();
				System.out.println();
				
				if(publisherInfo.toString().equalsIgnoreCase(publisher)){
					
					int index = publisherInfo.indexOf(publisher);
					
					System.out.println("Results:");
					System.out.println("+------------------------------------------+");
					System.out.printf("|                Book # %d                  |\n", (index + 1));
					System.out.println("+------------------------------------------+");
					System.out.println("ISBN: " + isbnInfo.get(index));
					System.out.println("Title: " + titleInfo.get(index));
					System.out.println("Author: " + authorInfo.get(index));
					System.out.println("Publisher: " + publisherInfo.get(index));
					System.out.println("Date Added (MM/DD/YYYY): " + dateAddedInfo.get(index));
					System.out.println("Quantity-On-Hand: " + qtyOnHandInfo.get(index));
					System.out.printf("Wholesale Cost: $ %6.2f\n", wholesaleInfo.get(index));
					System.out.printf("Retail Cost: $ %6.2f\n", retailInfo.get(index));
					System.out.println();

				}
				
				else{
					
					System.out.printf("The book containing \" %s \" publisher is not in the inventory!\n", publisher);
					
				}
				
			}
			
			else if(k == 5){
				
				System.out.println();
				System.out.println("+--------------------------------------+");
				System.out.println("| Returning to the Inventory Database  |");
				System.out.println("+--------------------------------------+");
				System.out.println();
				break;
				
			}
			
			System.out.println();
			System.out.println("+---------------------------------------+");
			System.out.println("| Search for a book by:                 |");
			System.out.println("|  1. ISBN number                       |");
			System.out.println("|  2. Book Title                        |");
			System.out.println("|  3. Author's name                     |");
			System.out.println("|  4. Publisher's name                  |");
			System.out.println("|  5. Return to the Inventory Database  |");
			System.out.println("+---------------------------------------+");
			System.out.println();
			
			k = 0;
				
		}
	}
	
}
