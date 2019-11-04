package Lesson6;

public class GuessMachine {

    private int number;
    private int numGuesses, guess;

    public GuessMachine() {

        numGuesses = 0;
        guess = 0;
        number = (int) (Math.random() * 100);
        
    }

    public String giveHint() {
        if (guess < number)
            return "You guessed a " + guess + " Too low: guess HIGHER";
         else if (guess > number) 
            return "You guessed a " +guess +" Too high: guess LOWER";
         else  return "You got it!";
       
       
   
    }
    public boolean setGuess(int number) {
     boolean guessOk = number>=1 && number<=100;
       if(guessOk){
           guess = number;
           numGuesses++;
           return true;
       } 
       return false;

    }

    public int getNumGuesses() {
         return numGuesses;
    }

}
