import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionTest{


@Test
void countEvens_shouldReturnCorrectCount_whenArrayHasMixedNumbers() {
    int[] inputNumbers = {1, 2, 3, 4, 5, 6};
    int actualCount = ArrayFunctions.countEvens(inputNumbers);
    assertEquals(3, actualCount);
}

@Test
void countEvens_shouldReturnZero_whenAllNumbersAreOdd() {
    int[] inputNumbers = {1, 3, 5, 7, 9};
    int actualCount = ArrayFunctions.countEvens(inputNumbers);
    assertEquals(0, actualCount);
}


@Test
void countEvens_shouldReturnZero_whenArrayIsEmpty() {
    int[] inputNumbers = {};
    int actualCount = ArrayFunctions.countEvens(inputNumbers);
    assertEquals(0, actualCount);
}


@Test
void countEvens_shouldCountZeroAsEven() {
    int[] inputNumbers = {0, 1, 3};
    int actualCount = ArrayFunctions.countEvens(inputNumbers);
    assertEquals(1, actualCount);
}


@Test
void countEvens_shouldCount














}
