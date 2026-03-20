import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Level5Task1Test {

    @Test
    void testWithMixedPrimesAndNonPrimes() {
        int[] givenNumbers = {5, 9, 3, 6, 2};
        int[] whenResult = Level5Task1.sortedPrimes(givenNumbers);
        int[] thenExpected = {2, 3, 5};
        assertArrayEquals(thenExpected, whenResult);
    }

    @Test
    void testWithNoPrimesInArray() {
        int[] givenNumbers = {4, 6, 8, 9};
        int[] whenResult = Level5Task1.sortedPrimes(givenNumbers);
        int[] thenExpected = {};
        assertArrayEquals(thenExpected, whenResult);
    }

    @Test
    void testWithAllPrimesInArray() {
        int[] givenNumbers = {7, 11, 2, 5};
        int[] whenResult = Level5Task1.sortedPrimes(givenNumbers);
        int[] thenExpected = {2, 5, 7, 11};
        assertArrayEquals(thenExpected, whenResult);
    }

    @Test
    void testWithOneAndZeroIncluded() {
        int[] givenNumbers = {0, 1, 3, 5};
        int[] whenResult = Level5Task1.sortedPrimes(givenNumbers);
        int[] thenExpected = {3, 5};
        assertArrayEquals(thenExpected, whenResult);
    }

    @Test
    void testWithNegativeNumbers() {
        int[] givenNumbers = {-3, -7, 2, 5};
        int[] whenResult = Level5Task1.sortedPrimes(givenNumbers);
        int[] thenExpected = {2, 5};
        assertArrayEquals(thenExpected, whenResult);
    }
}
