

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
		
		String scContinue;
		boolean userContinue = true;
		
		// Get input from user
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(userContinue) {
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
		
		//Test if the variables are working properly
		//System.out.println(fancyFriday + " " + sunny + " " + raining);
		
		
		//Use if statement to decide what to wear
		if (fancyFriday){
			if(sunny) {
				System.out.println("tea gown");
			}else if (raining) {	
			System.out.println("power suit");				
		}else{
			System.out.println(" long gown");
		}
		}else{
			System.out.println("tshirt and jeans");
		}

		//Ask if you want to continue
		System.out.println("Continue?");
		scContinue = sc.nextLine();
		if(scContinue.equals("yes")) {
			userContinue = true;
		}else{
			userContinue = false;
		}
	}//close while loop

}
}