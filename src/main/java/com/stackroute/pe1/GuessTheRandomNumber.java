package com.stackroute.pe1;
public class GuessTheRandomNumber {
    public String playguessingGame(int guessedNumber,int userInput) {
        if(userInput <= 0 || userInput > 50) {
            return "Enter number between 1 to 50";
        }
        if(userInput>guessedNumber) {
                return "Number guessed number is more than the original number";
            } else if (userInput < guessedNumber) {
                return "Number guessed number is less than the original number";
            } else {
                return "Number guessed matches the original number";
            }
        }
}
