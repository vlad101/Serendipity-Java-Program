import java.util.ArrayList;
import java.util.Scanner;

public class Reports {
	
	public static void repListing(){
		
		System.out.println("+---------------------------------+");
		System.out.println("| You Selected Inventory Listing  |");
		System.out.println("+---------------------------------+");
		System.out.println();
		ArrayList<String> isbnInfo = BookInfo.getIsbnInfo();
		System.out.println(isbnInfo);
		
	}
	
	public static void repWholesale(){
		
		System.out.println("+----------------------------------------+");
		System.out.println("| You Selected Inventory Wholesale Value |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
	}
	
	public static void repRetail(){
		
		System.out.println("+----------------------------------------+");
		System.out.println("| You Selected Inventory Retail Value    |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
	}
	
	public static void repQty(){
		
		System.out.println("+----------------------------------------+");
		System.out.println("| You Selected Listing By Quantity       |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
	}

	public static void repCost(){
		
		System.out.println("+----------------------------------------+");
		System.out.println("| You Selected Listing By Cost           |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
	}
	
	public static void repAge(){
		
		System.out.println("+----------------------------------------+");
		System.out.println("| You Selected Listing By Age            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
	}
	
	public static void printReportsMenu(){
		
		String choice;
		int x = 0;
		boolean b;
		char letter;
		boolean menu = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println("                          ********************************");
		System.out.println("                          *    Serendipity Booksellers   *");
		System.out.println("                          *            Reports           *");		
		System.out.println("                          ********************************");
		System.out.println("                          *                              *");
		System.out.println("                          * 1. Inventory Listing         *");
		System.out.println("                          * 2. Inventory Wolesale Value  *");
		System.out.println("                          * 3. Inventory Retail Value    *");
		System.out.println("                          * 4. Listing By Quantity       *");
		System.out.println("                          * 5. Listing By Age            *");
		System.out.println("                          * 6. Listing By Cost           *");
		System.out.println("                          * 7. Return to the Main Menu   *");
		System.out.println("                          *                              *");
		System.out.println("                          ********************************");
		System.out.println();
		
		do{
			
			System.out.print("Enter your choice: ");
			choice = keyboard.nextLine();
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
		
		do{
			
			if(x == 1){
				// BookInfo bookinfo = new BookInfo();
				// bookinfo.BookInfo();
				repListing();
			
			}
			
			else if(x == 2){
			
				repWholesale();
			
			}
			
			else if(x == 3){
				
				repRetail();
			
			}
			
			else if(x == 4){
				
				repQty();
				
			}
			
			else if(x == 5){
				
				repCost();
				
			}
			
			else if(x == 6){
				
				repAge();
				
			}
			
			else if(x == 7){
				
				System.out.println();
				System.out.println("+-----------------------------+");
				System.out.println("| Returning to the Main Menu  |");
				System.out.println("+-----------------------------+");
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
			
			printReportsMenu();
			
		}while(x == 7);
		
	}
}	