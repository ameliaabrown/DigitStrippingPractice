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
		//count number of digits
		Scanner secondUserInput = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int number = secondUserInput.nextInt();
		int challengeTwo = number;
		
		int counter = 0;
		while (challengeTwo > 0)
		{
			challengeTwo = challengeTwo/10;
			counter++;	
		}
		System.out.println("There are " + counter + " digits in your number.");

		int [] arrayTwo = new int [counter];
		for (int i = 0; i < arrayTwo.length; i++)
		{
			int digitStripping = number%10;
			arrayTwo[i] = digitStripping;
			number = number/10;
		}
		
		//count odd digits
		int counter2 = 0;
		for (int i = 0; i < arrayTwo.length; i++)
		{
			if (arrayTwo[i] % 2 != 0)
			{
				counter2++;
			}
			else 
			{
				counter2 = counter2+0;
			}
		}
		
		System.out.println("There are " + counter2 + " odd digits in your number.");
	
		//add up all the digits
	
		int sum = 0;
		for (int i = 0; i < arrayTwo.length; i++)
		{
			sum = sum + arrayTwo[i];
		}
		System.out.println("The sum of the numbers is " + sum);
	
		
		//round to nearest ten
		
		int sumLastNumber = sum%10;
		int rounded = 0;
		if (sum>=10)
		{
			if (sumLastNumber < 5)
			{
				rounded = sum - sumLastNumber;
			}
			else if (sumLastNumber > 5)
			{
				rounded = sum + sumLastNumber;
			}
			else if (sumLastNumber == 0)
			{
				rounded = rounded;
			}
		}
		
		
		if (sum<10)
		{
			if (sum >=5 )
			{
				rounded = 10;
			}
			else if (sum < 5)
			{
				rounded = 0;
			}
		}
		System.out.println("The rounded version of your number is " + rounded);

		
	}
}
