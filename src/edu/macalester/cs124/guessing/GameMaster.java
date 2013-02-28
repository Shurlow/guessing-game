package edu.macalester.cs124.guessing;

import java.util.Random;

import acm.program.ConsoleProgram;

public class GameMaster extends ConsoleProgram {
	
	public GameMaster() {
	}
	
//	public void run() {
//		startNewGame();
//		println(rand);
//		println(submitGuess(95));
//	}
	
	public void startNewGame(){
		Random randomGenerator = new Random();
		rand = randomGenerator.nextInt(100);
	 }
	 
	 public static int submitGuess(int guess){
		 COUNT += 1;
		 if(guess < rand){
			 return LOW;
		 } else if (guess > rand){
			 return HIGH;
		 } else
			 return CORRECT;
	 }
	 
	 public static int getGuessCount(){
		 return COUNT;
		 
	 }
	
		
	public static final int LOW = -1, HIGH = 1, CORRECT = 0;
	public static int rand;
	private static int COUNT;
	
	
	
	
}
