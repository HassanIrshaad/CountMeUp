/*
 * From what I have gathered, It's not clear what format the program should be in. I have assumed that it is a single function/program that carries out
 * the calculation and that's it. Therefore I have designed exactly that. 
 * 
 * Questions:
 * - Is this supposed to be a website of some sort? where a user is given 3 votes and votes on the site then the background program calculates it?
 * - Is is just supposed to be a simple program like I have done? I assumed all the front end stuff had been done already and my job was to create a program
 *   which just calculates and returns the results.
 */


import java.text.DecimalFormat;
import java.util.*;

public class Main {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		//My assumption is that the figures for percentages are given as percentages rather than whole numbers which will make the calculation for 
		//the function a lot easier.
		int total = 10000000;
		double a = 0.05;
		double b = 0.10;
		double c = 0.20;
		double d = 0.25;
		double e = 0.40;
		
		//The values are then passed through as parameters to the function
		CountMeUp(total, a, b, c, d, e);
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}
	
	public static void CountMeUp(int total, double a, double b, double c, double d, double e){
		double candidate1, candidate2, candidate3, candidate4, candidate5;
		
		//Votes are counted here and calculated depending on values passed through
		//Calculation for percentages is (decimal number * total number) 
		candidate1 = a*total;
		candidate2 = b*total;
		candidate3 = c*total;
		candidate4 = d*total;
		candidate5 = e*total;
		
		//This removes any trailing zeroes so that the double value becomes a whole number
		DecimalFormat df = new DecimalFormat("###.#");
		
		System.out.println("Here are the results:\n"
				+ "Candidate 1: " + df.format(candidate1) + " votes\n"
				+ "Candidate 2: " + df.format(candidate2) + " votes \n"
				+ "Candidate 3: " + df.format(candidate3) + " votes \n"
				+ "Candidate 4: " + df.format(candidate4) + " votes \n"
				+ "Candidate 5: " + df.format(candidate5) + " votes");
	}
}
