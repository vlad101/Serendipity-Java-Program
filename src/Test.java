import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	static ArrayList<String> titleInfo = BookInfo.getTitleInfo();
	
	static String title = "the";
	
	public static void main(String[] args){
		
		int amount = 0;
		
		String [] titles = titleInfo.toArray(new String[titleInfo.size()]);
		
		for(int j = 0; j < titles.length; j ++){
			
			System.out.println(titles[j].toLowerCase());
			
			System.out.println(title.toLowerCase());
				
				boolean fullContainsSub = titles[j].toLowerCase().indexOf(title.toLowerCase()) != -1;
				
				
				
				if(fullContainsSub){
					
					System.out.println("hi");
					amount++;
				
				}
				
			}
			
		}
			
	}