import java.util.Arrays;

public class Level5Task2 {

    static int[] replaceNegatives(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0) {
                result[index] = 0;
            } else {
                result[index] = numbers[index];
            }
        }
        return result;
    }
}
