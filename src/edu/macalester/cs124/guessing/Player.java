package edu.macalester.cs124.guessing;

public class Player {
	
	public void startNewGame(){
		guess = 0;
	}
	
	public int nextGuess(){
		return guess;	
	}
	
	public void guessWasHigh(){
		guess -= 1;
	}
	
	public void guessWasLow(){
		guess += 1;
		
	}

	public int guess;
}
