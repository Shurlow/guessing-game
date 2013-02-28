package edu.macalester.cs124.guessing;

import java.util.Random;

public class GameMaster {
	
	public GameMaster() {
	}
	
	public void startNewGame(){
		Random randomGenerator = new Random();
		rand = randomGenerator.nextInt(100);
	 }
	 
	 public int submitGuess(int guess){
		 count += 1;
		 if(guess < rand){
			 return LOW;
		 } else if (guess > rand){
			 return HIGH;
		 } else
			 return CORRECT;
	 }
	 
	 public int getGuessCount(){
		 return count;
		 
	 }
	
		
	public static final int LOW = -1, HIGH = 1, CORRECT = 0;
	public static int rand;
	private int count;
	
	
	
	
}
