import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InvMenu {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static boolean b = true;
	
	static boolean p;
	
	static int x;
	
	static double y;
	
	static double z;
	
	static String choice;
	
	static char letter = 'y';
	
	static ArrayList<String> isbnInfo = BookInfo.getIsbnInfo();
	static ArrayList<String> titleInfo = BookInfo.getTitleInfo();
	static ArrayList<String> authorInfo = BookInfo.getAuthorInfo();
	static ArrayList<String> publisherInfo = BookInfo.getPublisherInfo();
	static ArrayList<String> dateAddedInfo = BookInfo.getDateAddedInfo();
	static ArrayList<Integer> qtyOnHandInfo = BookInfo.getQtyOnHandInfo();
	static ArrayList<Double> wholesaleInfo = BookInfo.getWholesaleInfo();
	static ArrayList<Double> retailInfo = BookInfo.getRetailInfo();
					
	public static void editBook(){
		
		System.out.println();
		System.out.println("+-----------------------------------+");
		System.out.println("| You Selected Edit a Book's Record |");
		System.out.println("+-----------------------------------+");
		System.out.println();
		
		//isbnInfo.set(0, "hahah");
		
	}
	
	public static void deleteBook(){
		
		System.out.println();
		System.out.println("+-----------------------------+");
		System.out.println("| You Selected Delete a Book  |");
		System.out.println("+-----------------------------+");
		System.out.println();
		
		// isbnInfo.remove(0);
		
	}
	
	public static void printInvMenu(){
		
		String choice;
		int x = 0;
		boolean b;
		char letter;
		boolean menu = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("                          ********************************");
		System.out.println("                          *    Serendipity Booksellers   *");
		System.out.println("                          *       Inventory Database     *");		
		System.out.println("                          ********************************");
		System.out.println("                          *                              *");
		System.out.println("                          * 1. Look Up Book              *");
		System.out.println("                          * 2. Add a Book                *");
		System.out.println("                          * 3. Edit a Book's Record      *");
		System.out.println("                          * 4. Delete a Book             *");
		System.out.println("                          * 5. Return to the Main Menu   *");
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
			
				LookUpBook.lookUpBook();
			
			}
			
			else if(x == 2){
			
				AddBook.addBook();
			
			}
			
			else if(x == 3){
			
				editBook();
			
			}
			
			else if(x == 4){
			
				deleteBook();
			
			}
			
			else if(x == 5){
			
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
			
			printInvMenu();
			
		}while(x == 5);
		
	}
}
