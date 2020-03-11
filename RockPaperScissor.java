/***************************
* Created by: Ben Lapuhapo.
* Created on: March 10 2020
* This program is a Rock paper scissors Game
****************************/

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
 
	public static final String ROCK = "R";
	public static final String PAPER = "P";
	public static final String SCISSORS = "S";
 
	/**
	 * Get the game Result
	 * */
	public static void getResult(String usersMove, String computersMove) {
	
        System.out.println("Computer Picked: " + computersMove);
 
        if (usersMove.equals(computersMove))
	        System.out.println("It's a tie!");
        else if (usersMove.equals(ROCK)) 
        {
	        if (computersMove.equals(SCISSORS))
		        System.out.println("User Wins!! Rock breaks scissors.");
	        else if (computersMove.equals(PAPER))
		        System.out.println("Computer Wins!! Paper eats rock.");
        } 
        else if (usersMove.equals(PAPER)) 
        {
            if (computersMove.equals(ROCK))
		        System.out.println("You win!! Paper eats rock.");
	        else if (computersMove.equals(SCISSORS))
		        System.out.println("You lose!! Scissor cuts paper.");
        } 
        else if (usersMove.equals(SCISSORS)) 
        {
	        if (computersMove.equals(PAPER))
		        System.out.println("User Wins!! Scissor cuts paper.");
	        else if (computersMove.equals(ROCK))
		        System.out.println("Computer Wins!! Rock breaks scissors.");
        } 
        else
    	    System.out.println("Invalid user input.");
    }
	/**
	 * Get Computer's move
	 * */
public static String getComputersMove(){
		int computersNum;
		String computersMove="";
		Random random = new Random();
		computersNum = random.nextInt(3) + 1;
		if (computersNum == 1)
			computersMove = ROCK;
		else if (computersNum == 2)
			computersMove = PAPER;
		else if (computersNum == 3)
			computersMove = SCISSORS;
		
		return computersMove;
	}
	/**
	 * Get User's move
	 * */
	
	public static String getUsersMove(){
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("You Picked: ");
		String input = scanner.next().toUpperCase();
        return input;
    }
	
    /**
     * Main method
     * */	
	public static void main(String[] args) {
		System.out.println( "Rock, Paper, Scissors!\n"
				+ "Please enter a move.\n" 
				+"Rock = R, Paper= P, and Scissors = S.\n");
	
		String userInput = getUsersMove(); 
		if (userInput.equals(PAPER) || userInput.equals(ROCK) || userInput.equals(SCISSORS)) 
			getResult(userInput, getComputersMove());
		else 
			System.out.println("Invalid Input " + userInput);
	}
}