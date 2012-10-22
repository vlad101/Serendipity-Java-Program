import java.util.ArrayList;
import java.util.Scanner;


public class AddBook {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static InvMenu invmenu = new InvMenu();
	
	static boolean b = true;
	
	static boolean p;
	
	static int x;
	
	static double y;
	
	static double z;
	
	static String choice;
	
	static char letter;
	
	static ArrayList<String> isbnInfo = BookInfo.getIsbnInfo();
	static ArrayList<String> titleInfo = BookInfo.getTitleInfo();
	static ArrayList<String> authorInfo = BookInfo.getAuthorInfo();
	static ArrayList<String> publisherInfo = BookInfo.getPublisherInfo();
	static ArrayList<String> dateAddedInfo = BookInfo.getDateAddedInfo();
	static ArrayList<Integer> qtyOnHandInfo = BookInfo.getQtyOnHandInfo();
	static ArrayList<Double> wholesaleInfo = BookInfo.getWholesaleInfo();
	static ArrayList<Double> retailInfo = BookInfo.getRetailInfo();
	
	public static void addBook(){
		
		System.out.println();
		System.out.println("+-----------------------------+");
		System.out.println("| You Selected Add a Book     |");
		System.out.println("+-----------------------------+");
		System.out.println();
		
		System.out.print("\nEnter ISBN number: "); 
		String isbn = keyboard.nextLine();
		isbnInfo.add(isbn);
		
		System.out.print("Enter Book Title: "); 
		String title = keyboard.nextLine();
		titleInfo.add(title);
		
		System.out.print("Enter Author's name: "); 
		String author = keyboard.nextLine();
		authorInfo.add(author);
	
		System.out.print("Enter Publisher's name: "); 
		String publisher = keyboard.nextLine();
		publisherInfo.add(publisher);
		
		System.out.print("Enter The Date the Book is Added to the Inventory (MM/DD/YYYY): "); 
		String dateAdded = keyboard.nextLine();
		dateAddedInfo.add(dateAdded);
		
		do{
			
			b = true;
			System.out.print("Enter The Quantity of Book Being Added: ");
			String qtyOnHand = keyboard.nextLine();
			
			try {
				
				x = Integer.parseInt(qtyOnHand);
				
			}
			
			catch(NumberFormatException nFE) {
				
				b = false;
				System.out.println();
				System.out.println("--------------------------------------------------------");
				System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
				System.out.println("--------------------------------------------------------");
				System.out.println();
				
			}
				
		}while(b == false);
		
		qtyOnHandInfo.add(x);

		do{
			
			b = true;
			System.out.print("Enter The Wholesale Cost of the Book: ");
			String wholesaleInfo = keyboard.nextLine();
			
			try {
				
				y = Double.parseDouble(wholesaleInfo);
				
			}
			
			catch(NumberFormatException nFE) {
				
				b = false;
				System.out.println();
				System.out.println("--------------------------------------------------------");
				System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
				System.out.println("--------------------------------------------------------");
				System.out.println();
				
			}
				
		}while(b == false);
		
		wholesaleInfo.add(y);
		
		do{
			
			b = true;
			System.out.print("Enter The Retail Price of the Book: ");
			String retailInfo = keyboard.nextLine();
			
			try {
				
				z = Double.parseDouble(retailInfo);
				
			}
			
			catch(NumberFormatException nFE) {
				
				b = false;
				System.out.println();
				System.out.println("--------------------------------------------------------");
				System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
				System.out.println("--------------------------------------------------------");
				System.out.println();
				
			}
				
		}while(b == false);
		
		retailInfo.add(z);		
		
		letter = 'y';
		
		while(letter == 'y' || letter == 'Y'){
		
			System.out.println("\nYou entered the following Book Information: \n");
			System.out.println("ISBN number: " + isbnInfo.get(isbnInfo.size() - 1));
			System.out.println("Book Title: " + titleInfo.get(titleInfo.size() - 1));
			System.out.println("Author's name: " + authorInfo.get(authorInfo.size() - 1));
			System.out.println("Publisher's name: " + publisherInfo.get(publisherInfo.size() - 1));
			System.out.println("The Date the Book is Added to the Inventory (MM/DD/YYYY): " + dateAddedInfo.get(dateAddedInfo.size() - 1));
			System.out.println("The Quantity of Book Being Added: " + qtyOnHandInfo.get(qtyOnHandInfo.size() - 1));
			System.out.printf("The Wholesale Cost of the Book: $ %6.2f\n", wholesaleInfo.get(wholesaleInfo.size() - 1));
			System.out.printf("The Retail Price of the Book: $ %6.2f\n", retailInfo.get(retailInfo.size() - 1));
			System.out.println();
			
			
			do{
				
				System.out.println("---------------------------------------");
				System.out.print(" Is Information Entered Correct? (Y/N)\n");
				choice = keyboard.nextLine();
				letter = choice.charAt(0);
				System.out.println();
							
				if(letter == 'Y' || letter == 'y' || letter == 'N' || letter == 'n'){
					
					b = true;
					
				}
					
				else{ 
					
					b = false;
				
				}
				
				while(!b) {
					
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
					System.out.println("--------------------------------------------------------");
					System.out.println();
					break;

				}
					
			}while(b == false);
			
			if(letter == 'N' || letter  == 'n'){
				
				x = 0;	
				
				while(x != 3){
					System.out.println();
					System.out.println("+---------------------------------------+");
					System.out.println("| Modify your Entry:                    |");
					System.out.println("|  1. Edit Book's Entry                 |");
					System.out.println("|  2. Delete Book's Entry               |");
					System.out.println("|  3. Return to the Inventory Database  |");
					System.out.println("+---------------------------------------+");
					System.out.println();
										
				
				
					do{
						
						System.out.print("Enter your choice: ");
						choice = keyboard.nextLine();
						System.out.println();
						b = true;
							
						try {
							
							x = Integer.parseInt(choice);
							
						}
							
						catch(NumberFormatException nFE) {
							
							b = false;
							System.out.println();
							System.out.println("--------------------------------------------------------");
							System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
							System.out.println("--------------------------------------------------------");
							System.out.println();
							
						}
								
					}while(b == false);
						
					if(x == 1){
						
						invmenu.editBook();
						
					}
					
					else if(x == 2){
						
						invmenu.deleteBook();
						
						
					}
						
					else if(x == 3){
			
						System.out.println();
						System.out.println("+--------------------------------------+");
						System.out.println("| Returning to the Inventory Database  |");
						System.out.println("+--------------------------------------+");
						System.out.println();
						break;
						
					}
						
					else{
						
						System.out.println();
						System.out.println("--------------------------------------------------------");
						System.out.println(" !!!   You did not enter a valid value. Try again   !!!");
						System.out.println("--------------------------------------------------------");
						System.out.println();
						
					}
					
				}
					
			}	
			
			else{
				
				System.out.println();
				System.out.println("+------------------------------------+");
				System.out.println("| The Book is Added to the Inventory |");
				System.out.println("+------------------------------------+");
				System.out.println();
				break;
				
			}
		
		}
		
	}
			
}
