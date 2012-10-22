import java.util.Scanner;

public class MainMenu {
		
	public static void main(String[] args) {
		
		Reports reports = new Reports();
			
		InvMenu invmenu = new InvMenu();
		
		Cashier cashier = new Cashier();
		
		BookInfo bookinfo = new BookInfo();
		
		String choice;
			
		int x = 0;
		boolean b;
		char letter;
			
		Scanner keyboard = new Scanner(System.in);
	
		while(x != 4){
			
			//bookinfo.BookInfo();
			System.out.println();
			System.out.println("                          ********************************");
			System.out.println("                          *    Serendipity Booksellers   *");
			System.out.println("                          *           Main Menu          *");		
			System.out.println("                          ********************************");
			System.out.println("                          *                              *");
			System.out.println("                          * 1. Cashier Module            *");
			System.out.println("                          * 2. Inventory Database Module *");
			System.out.println("                          * 3. Report Module             *");
			System.out.println("                          * 4. Exit                      *");
			System.out.println("                          *                              *");
			System.out.println("                          ********************************");
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
				
				System.out.println();
				System.out.println("+-----------------------------+");
				System.out.println("| You Selected Cashier Module |");
				System.out.println("+-----------------------------+");
				System.out.println();
					
				cashier.printCashier();
				
			}
			
			else if(x == 2){
				
				System.out.println();
				System.out.println("+----------------------------------------+");
				System.out.println("|  You Selected Inventory Database Module|");
				System.out.println("+----------------------------------------+");
				System.out.println();
			
				invmenu.printInvMenu();
				
				
			}
					
				
			else if(x == 3){
				
				System.out.println();
				System.out.println("+----------------------------+");
				System.out.println("| You Selected Report Module |");
				System.out.println("+----------------------------+");
				System.out.println();
				
				reports.printReportsMenu();
			}
				
			else if(x == 4){
	
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
		
		System.out.println();
		System.out.println("********************************");
		System.out.println(" You exit the Program. Bye-bye!");
		System.out.println("********************************");
		System.exit(0);
			
	}
}