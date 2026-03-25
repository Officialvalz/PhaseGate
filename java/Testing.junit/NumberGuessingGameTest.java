import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberGuessingGameTest {

    @Test
    void testGuessTooLow() {
        assertEquals("LOW", TheGuessingGame.checkNumberOfGuess(50, 20));
    }

    @Test
    void testGuessTooHigh() {
        assertEquals("HIGH", TheGuessingGame.checkNumberOfGuess(50, 80));
    }

    @Test
    void testGuessCorrect() {
        assertEquals("CORRECT", TheGuessingGame.checkNumberOfGuess(50, 50));
    }
    
    @Test
    void testWhenAUserEnterANonNumber();
    	assertEquals("NON NUMBER",TheGuessingGame.checkNumberOfGuess(one, two)); 
}
