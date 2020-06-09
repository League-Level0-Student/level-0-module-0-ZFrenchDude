package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0; 
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 84-12?");
				// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("72")) {
		score++;
			
		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		else {
			if (score > 0) {
				score--;
				}		}
		
		answer = JOptionPane.showInputDialog("What's the date today in numbers?");
		if(answer.equalsIgnoreCase("6/9/20")) {
			score++;
				
			}
		else {
			if (score > 0) {
			score--;
			}
		}
		
		answer = JOptionPane.showInputDialog("What's the US Capitol?");
		if(answer.equalsIgnoreCase("Washington DC")) {
			score++;
				
			}
		else {
			if (score > 0) {
			score--;
			}
		}
		
		answer = JOptionPane.showInputDialog("Do you take classes at The League?");
		if(answer.equalsIgnoreCase("yes")) {
			score++;
				
			}
		else {
			if (score > 0) {
			score--;
			JOptionPane.showMessageDialog(null, "You should " );
			}
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "You got " +score+ "!" );
		
	}
}
