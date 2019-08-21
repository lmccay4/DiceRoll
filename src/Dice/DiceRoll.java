package Dice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiceRoll {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		
		do {	
			
			System.out.println("Please enter a number of times to roll the dice: ");
			int input = scanner.nextInt();
			
			ArrayList<Integer> rollsArray = new ArrayList<>();	
		
			int roll = 0;
			int totalRoll = 0;
			int average;
			int mode;
			int lineNum = 1;
			double stdDev = 0.0;
			System.out.println(input + " Rolls of The Dice:");
			for (int i = 0; i < input; i++)
				{
					roll = randomInt(1, 6);
					rollsArray.add(roll);
					totalRoll += roll;
					System.out.println("Roll #" + lineNum + ": " + roll + " ");
					lineNum++;
				}
		
			//Find mode
			// make this a hashmap eventually
			int occurrences1 = Collections.frequency(rollsArray, 1);
			int occurrences2 = Collections.frequency(rollsArray, 2);
			int occurrences3 = Collections.frequency(rollsArray, 3);
			int occurrences4 = Collections.frequency(rollsArray, 4);
			int occurrences5 = Collections.frequency(rollsArray, 5);
			int occurrences6 = Collections.frequency(rollsArray, 6);
		
			mode = occurrences1;
			String modeLabel = "1";
		
			if ((occurrences2)> mode) 
			{
				mode = occurrences2;
				modeLabel = "2";
			}
		
			if (occurrences3 > mode) 
			{
				mode = occurrences3;
				modeLabel = "3";
			}
		
			if (occurrences4 > mode) 
			{
				mode = occurrences4;
				modeLabel = "4";
			}
		
			if (occurrences5 > mode) 
			{
				mode = occurrences5;
				modeLabel = "5";
			}
		
			if (occurrences6 > mode) 
			{
				mode = occurrences6;
				modeLabel = "6";
			}
		

			average = (totalRoll/lineNum);
		
			//Calculate standard deviation 
			for (double number: rollsArray) {
				stdDev += Math.pow(number - average, 2);
			}
		
			stdDev = Math.sqrt(stdDev/rollsArray.size());
		
		
			System.out.println("-------------");
			System.out.println("Sum: " + totalRoll);
			System.out.println("Mode: " + modeLabel + " occured " + mode + " times.");
			System.out.println("Average: " + average);
			System.out.println("Standard Deviation: " + stdDev);

		} while(rollAgain() );
		
	}
	
	//method for generating which number is rolled as roll variable
	public static int randomInt(int low, int high)
	{
		int result = (int)(Math.random() * (high - low + 1) + low);
		return result;
	}
	
	public static boolean rollAgain() 
	{
		System.out.println();
		System.out.println("Another? (Y or N) ");
		
		Scanner scanner = new Scanner(System.in);
		
		String reply = scanner.nextLine();
		
		if (reply.equalsIgnoreCase("Y"))
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");


			return true;
		}
		
		return false;
	}
	
}
