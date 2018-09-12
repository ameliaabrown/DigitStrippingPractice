import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class DigitStripping {

	public static void main(String[] args) {
	challengeOne();
	challengeTwoThroughFive();
	}

	public static void challengeOne()
	{
		int[] userNumbers = new int [6];
		System.out.println("Please enter a six digit number.");
		Scanner userInput = new Scanner(System.in);
		
		int userNumber = userInput.nextInt();
		for (int i = 0; i < userNumbers.length; i++)
		{
			int digitStripping = userNumber%10;
			userNumbers[i] = digitStripping;
			userNumber = userNumber/10;
			
		}
		System.out.println(Arrays.toString(userNumbers));
	}

	
	public static void challengeTwoThroughFive()
	{
		Scanner secondUserInput = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int inputLength = secondUserInput.nextInt();
		
		int counter = 0;
		while (inputLength > 0)
		{
			inputLength = inputLength/10;
			counter++;	
		}
		System.out.println("There are " + counter + " digits in your number.");


		
	
		int[] userNumbers2 = new int [6];
		
		int userNumber2 = inputLength.nextInt();
		for (int i = 0; i < userNumbers2.length; i++)
		{
			int digitStripping = userNumber2%10;
			userNumbers2[i] = digitStripping;
			userNumber2 = userNumber2/10;
			
		}
		System.out.println(Arrays.toString(userNumbers2));
	}

	
	}

