import java.util.Arrays;

public class Level5Task1 {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] sortedPrimes(int[] numbers) {
        int primeCount = 0;
        for (int currentNumber : numbers) {
            if (isPrime(currentNumber)) {
                primeCount++;
            }
        }

        int[] primeArray = new int[primeCount];
        int position = 0;
        for (int currentNumber : numbers) {
            if (isPrime(currentNumber)) {
                primeArray[position] = currentNumber;
                position++;
            }
        }

        Arrays.sort(primeArray);
        return primeArray;
    }
}
