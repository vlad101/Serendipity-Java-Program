import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Cashier {

	public static void printCashier() {
		
		boolean b;
		int x = 0;
		double y = 0;
		char letter = 'y';
		
		while(letter == 'y' || letter == 'Y'){

			Scanner keyboard = new Scanner(System.in);
			
			System.out.println();
			System.out.println("                          ********************************");
			System.out.println("                          *    Serendipity Booksellers   *");
			System.out.println("                          *        Cashier Module        *");		
			System.out.println("                          ********************************");
			System.out.println();
			
			DateFormat formatterDate = new SimpleDateFormat("EEE, dd MMMM yyyy");
			Date date = Calendar.getInstance().getTime();
			String today = formatterDate.format(date);
			System.out.println("Date: " + today);
			
			DateFormat formatterTime = new SimpleDateFormat("hh:mm:ss a");
			Date time = Calendar.getInstance().getTime();
			String now = formatterTime.format(date);
			System.out.println("Time: " + now);
			System.out.println();
			
			do{
				
				b = true;
				System.out.print("Quantity of Book: ");
				String numBooks = keyboard.nextLine();
				
				try {
					x = Integer.parseInt(numBooks);
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
			
			System.out.print("ISBN: ");
			String isbn = keyboard.nextLine();
			
			
			System.out.print("Title: ");
			String title = keyboard.nextLine();
			
			do{
				
				b = true;
				System.out.print("Price: ");
				String price = keyboard.nextLine();
				
				try {
					
					y = Double.parseDouble(price);
					
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
			
			double subTotal = x  * y;
			double tax = subTotal * 0.06;
			double total = subTotal + tax;
			
			System.out.println("\n\nSerendipity Booksellers\n");
			System.out.println("Date: "  + today);
			System.out.println("Time: "  + now);
			System.out.println();
			System.out.printf("%-5s %-30s %-30s %-10s %-8s\n", "Qty", "ISBN", "Title", "Price", "Total");
			for(int i = 0; i <= 85; i++){
				System.out.print("_");
			}
			
			System.out.println();
			System.out.printf(" %d   %-30s %-30s $%6.2f   $%6.2f\n\n", x, isbn, title, y, subTotal);
			System.out.printf("                 Subtotal:                             $%6.2f\n", subTotal);
			System.out.printf("                 Tax:                                  $%6.2f\n", tax);
			System.out.printf("                 Total:                                $%6.2f\n\n", total);
			System.out.println(" *~*~*  Thank You for Shopping at Serendipity! *~*~*");
			
			System.out.println();
			System.out.println();
			System.out.print(" Do You Want to Continue? (Y/N) ");
			String response = keyboard.nextLine();
			while(response.equals("")){
				
				System.out.print(" Do You Want to Continue? (Y/N) ");
				response = keyboard.nextLine();	
				if(!response.equals(""))
					letter = response.charAt(0);
				if(letter != 'y' || letter != 'Y' || letter != 'n' || letter != 'N'){
					System.out.print(" Do You Want to Continue? (Y/N) ");
					response = keyboard.nextLine();	
					if(!response.equals(""))
						letter = response.charAt(0);
				}
				else
					break;
			}
			
		}
		
		System.out.println();
		System.out.println("***************************************");
		System.out.println(" You exit the cashier module. Bye-bye!");
		System.out.println("***************************************");
		System.out.println();
		
	}

}