/**
 * 
 */
package labExercises;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Exercise13_HeadOrTails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userGuess = userGuess();
		int result = computerSelection();
		resultPrintout(userGuess, result);

	}

	
	/** 
	 * This method acquires the user choice (Heads or tails) and converts it to a userConvertedSelection - Heads = 1 - Tails =2 
	 * @return - User selection
	 */
	public static int userGuess() {

		String userGuess;
		int userConvertedSelection;

		Scanner myScan = new Scanner(System.in);
		
		// User Prompt
		
		System.out.println("Do you choose heads or tails?");
		System.out.println();

		// User Input
		userGuess = myScan.nextLine();
		System.out.println();
		myScan.close();

		if (userGuess.equalsIgnoreCase("Heads")) {
			userConvertedSelection = 1;
			return userConvertedSelection = 1;
		} else if (userGuess.equalsIgnoreCase("Tails")) {
			userConvertedSelection = 2;
			return userConvertedSelection = 2;
		} else {
			System.out.println("Invalid input");
			System.out.println();
			return userConvertedSelection = -1;
		}
		

	}
	
	/**
	 * This method randomly simulates a coin toss - heads = 1 - tails = 2 and outputs the result to the console
	 * @return - The result of the simulated coin toss
	 */
	public static int computerSelection() {
		
		String computerConvertedSelection;
		int result;
		
		Random rand = new Random();

		// result == 1 Heads/ result == 2 Tails
		result = rand.nextInt(1, 3);
		if (result == 1) {
			computerConvertedSelection = "Heads";
			System.out.println("Flip Outcome: " + computerConvertedSelection);
			System.out.println();
			return result = 1;
		} else {
			computerConvertedSelection = "Tails";
			System.out.println("Flip Outcome: " + computerConvertedSelection);
			System.out.println();
			return result = 2;
		}
		
	}
	
	
	/**
	 * This method outputs to the result of the game i.e. if the user's guess was correct
	 * @param userConvertedSelection - User Heads or Tails
	 * @param result - Heads or Tails based on the computer simulation
	 */
	public static void resultPrintout (int userConvertedSelection, int result) {
		
		if (userConvertedSelection == 1 && result == 1) {
			System.out.println("Well done - Heads it Was!");
		} else if (userConvertedSelection == 2 && result == 2) {
			System.out.println("Well done - Tails it Was!");
		} else if (userConvertedSelection == 1 && result == 2) {
			System.out.println("Bad luck - It was Tails!");
		} else if (userConvertedSelection == 2 && result == 1) {
			System.out.println("Bad luck - It was Heads!");
		} else {
			System.out.println("Input heads of tails to play the game!");
		}
		
	}

}
