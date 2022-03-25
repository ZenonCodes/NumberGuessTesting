import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuessGameTest {

    @Test
    public void winWhenGuessesContainsCorrectGuessTest(){
        NumberGuessGame testGame = new NumberGuessGame();
        HashSet<Integer> guesses = new HashSet<Integer>();
        guesses.add(testGame.getCorrectGuess());

        testGame.checkGuess(guesses);
        boolean actual = testGame.isWinner();


        assertTrue(actual);
    }
    @Test
    public void loseWhenCorrectGuessNotInGuessesTest(){
        NumberGuessGame testGame = new NumberGuessGame();
        HashSet<Integer> guesses = new HashSet<Integer>();

        testGame.checkGuess(guesses);
        boolean actual = testGame.isWinner();

        assertFalse(actual);
    }


    @Test
    void getCorrectGuessFetchesSetGuess() {
        NumberGuessGame testGame = new NumberGuessGame();

        int expected = 5;
        testGame.setCorrectGuess(expected);
        int actual = testGame.getCorrectGuess();

        assertEquals(actual,expected);



    }

    @Test
    void getGuesses() {
        NumberGuessGame testGame = new NumberGuessGame();
        testGame.setGuesses();

        int actual = testGame.getGuesses().size();
        int expected = testGame.getLimit();

        assertEquals(actual,expected);


    }

    @Test
    void setGuesses() {
        NumberGuessGame testGame = new NumberGuessGame();
        Random random = new Random();

        int actual = random.nextInt(0,6);
        testGame.setCorrectGuess(actual);
        int expected = testGame.getCorrectGuess();

        assertEquals(expected, actual);

    }
}