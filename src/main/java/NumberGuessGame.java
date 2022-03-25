import java.util.HashSet;
import java.util.Random;

public class NumberGuessGame {
    Random random = new Random();


    boolean winner;
    private int correctGuess = random.nextInt(0,6);
    private final int limit = 3;
    private HashSet<Integer> guesses = new HashSet<>();


    public NumberGuessGame(){}

    public void checkGuess(HashSet<Integer> guesses) {
       for (int guess : guesses) {
           if (guess == getCorrectGuess()){winner = true;}
       }
    }

    public int getCorrectGuess() {
        return correctGuess;
    }

    public void setCorrectGuess(int correctGuess) {
        this.correctGuess = correctGuess;

    }


    public HashSet<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses() {
        for(int i = 0; guesses.size() < limit; i++) {
            guesses.add(random.nextInt(0, 6));
        }
    }

    public boolean isWinner() {
        return winner;
    }

    public int getLimit() {
        return limit;
    }



}
