import java.util.Scanner;

public class Typing_Test_Main {
	public static void main(String[] args){
		// The main method for the typing game
		char target;
		String userInput;
		int score = 0;
		int attempts = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Try to type the target. There will be 15 targets and 3 attempts to type each target.");
		
		for (int i = 0; i < 15; i++){
			target = (char)('a' + Math.random() * ('z' - 'a' + 1));
			System.out.println("The target is: " + target);
			userInput = input.next();
			while (attempts < 2 && !(userInput.equals(String.valueOf(target)))){
				System.out.println("Try again");
				System.out.println("Target is " + target);
				userInput = input.next();
				attempts++;
			}// loop for ending based on failed attempts
			if (userInput.equals(String.valueOf(target))){
				score++;
			}// give user a point for typing the correct input
			attempts = 0; // initialize the attempts to 0 for each target
		} // end of target value loop
		System.out.println("You scored " + score + " points!");
	}
}
