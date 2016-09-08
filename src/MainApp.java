

/**This is a demo app deciding what to wear.
 * 
 */

/**
 * @author computer
 *
 */

import java.util.Scanner;
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String scFancyFriday, scSunny, scRaining;
		boolean fancyFriday = false;
		boolean sunny = false;
		boolean raining = false;
		
		// Get input from user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is it fancy friday?");
		scFancyFriday = sc.nextLine();
		
		System.out.println("Is it sunny?");
		scSunny = sc.nextLine();
		
		System.out.println("Is it raining?");
		scRaining = sc.nextLine();
		
		
		//Test if the variables are working properly
		//System.out.println(scFancyFriday + " " + scSunny + " " + scRaining);
		
		//Set condition variables based on input
		
		if (scFancyFriday.equalsIgnoreCase("yes")) {
			fancyFriday = true;
		}
		if (scSunny.equalsIgnoreCase("yes")) {
			sunny = true;
		}
		if (scRaining.equalsIgnoreCase("yes")) {
			raining = true;
		}
		
		System.out.println(fancyFriday + " " + sunny + " " + raining);
		
		
		//Use if statement to decide what to wear

	}

}
