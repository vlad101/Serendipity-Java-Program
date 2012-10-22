import java.util.ArrayList;
import java.util.Scanner;


public class BookInfo {
		
	static Scanner keyboard = new Scanner(System.in);
	
	// Global arrayslist accessible by all methods
	
	private static ArrayList<String> isbnInfo = new ArrayList<String>(){{
		
		add("978-0060014018");
		add("978-0449221431");
		add("978-0545132060");
		add("978-0312474881");
		add("978-0547745527");
		
	}};
	
	private static ArrayList<String> titleInfo = new ArrayList<String>(){{
		
		add("The Greatest Stories");
		add("The Novel");
		add("Smile");
		add("The Bedford Introduction to Drama");
		add("AWOL on the Appalachian Trail");
		
	}};		
	
	private static ArrayList<String> authorInfo = new ArrayList<String>(){{
		
		add("Rick Beyer");
		add("James A. Michener");
		add("Raina Telgemeier");
		add("Lee A. Jacobus");
		add("David Miller");
		
	}};
					
	private static ArrayList<String> publisherInfo = new ArrayList<String>(){{
		
		add("HerperResource");
		add("Fawcett");
		add("Graphix");
		add("Bedford St. Martins");
		add("Mariner Books");
		
	}};	
	
	private static ArrayList<String> dateAddedInfo = new ArrayList<String>(){{
		
		add("05/18/2003");
		add("07/07/1992");
		add("02/01/2010");
		add("09/05/2008");
		add("11/01/2011");
		
	}};	
	
	
	private static ArrayList<Integer> qtyOnHandInfo = new ArrayList<Integer>(){{
		
		add(7);
		add(5);
		add(10);
		add(2);
		add(8);
		
	}};	
	
	
	private static ArrayList<Double> wholesaleInfo = new ArrayList<Double>(){{
		
		add(12.91);
		add(7.99);
		add(6.09);
		add(54.99);
		add(10.17);
		
	}};	
	
	
	private static ArrayList<Double> retailInfo = new ArrayList<Double>(){{
		
		add(18.99);
		add(3.84);
		add(4.90);
		add(88.30);
		add(14.95);
		
	}};	
	
	
	public static ArrayList<String> getIsbnInfo(){ 
		
		return isbnInfo;
		
	}
	
	
	public static ArrayList<String> getTitleInfo(){ 
		
		return titleInfo;
		
	}
	
	
	public static ArrayList<String> getAuthorInfo(){ 
		
		return authorInfo;
		
	}
	
	public static ArrayList<String> getPublisherInfo(){ 
		
		return publisherInfo;
		
	}
	
	public static ArrayList<String> getDateAddedInfo(){ 
		
		return dateAddedInfo;
		
	}
	
	public static ArrayList<Integer> getQtyOnHandInfo(){ 
		
		return qtyOnHandInfo;
		
	}

	public static ArrayList<Double> getWholesaleInfo(){ 
		
		return wholesaleInfo;
		
	}
	
	public static ArrayList<Double> getRetailInfo(){ 
		
		return retailInfo;
		
	}
	
	public static void BookInfo() {
		
		System.out.println();
		System.out.println("                          ****************************");
		System.out.println("                          *  Serendipity Booksellers *");
		System.out.println("                          *     Book Information     *");		
		System.out.println("                          ****************************");
		System.out.println();
		
	for(int i = 0; i < isbnInfo.size(); i++){
			
			System.out.println("+------------------------------------------+");
			System.out.printf("|                Book # %d                  |\n", (i + 1));
			System.out.println("+------------------------------------------+");
			System.out.println("ISBN: " + isbnInfo.get(i));
			System.out.println("Title: " + titleInfo.get(i));
			System.out.println("Author: " + authorInfo.get(i));
			System.out.println("Publisher: " + publisherInfo.get(i));
			System.out.println("Date Added (MM/DD/YYYY): " + dateAddedInfo.get(i));
			System.out.println("Quantity-On-Hand: " + qtyOnHandInfo.get(i));
			System.out.printf("Wholesale Cost: $ %6.2f\n", wholesaleInfo.get(i));
			System.out.printf("Retail Cost: $ %6.2f\n", retailInfo.get(i));
			System.out.println();
		
		}
	}
	
}
