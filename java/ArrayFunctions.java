import java.util.Arrays;

public class ArrayFunctions {

    public static int countEvens(int[] numbers) {
        int evenCount = 0;
        for (int currentNumber : numbers) {
            if (currentNumber % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int linearSearch(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static int[] squares(int numberOfSquares) {
        if (numberOfSquares <= 0)
            return new int[]{};
        int[] squaresArray = new int[numberOfSquares];
        for (int squareIndex = 1; squareIndex <= numberOfSquares; squareIndex++) {
            squaresArray[squareIndex - 1] = squareIndex * squareIndex;
        }
        return squaresArray;
    }

    public static boolean arraysEqual(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        
        int[] mixedNumbers = {1, 2, 3, 4, 5, 6};
        int evenCount = countEvens(mixedNumbers);
        System.out.println("countEvens({1,2,3,4,5,6}) = " + evenCount);
       

        int[] allOddNumbers = {1, 3, 5, 7};
        System.out.println("countEvens({1,3,5,7}) = " + countEvens(allOddNumbers));
        

        int[] emptyNumbers = {};
        System.out.println("countEvens({}) = " + countEvens(emptyNumbers));
        

        System.out.println();

        
        int[] searchNumbers = {10, 30, 50, 70, 90};
        int foundIndex = linearSearch(searchNumbers, 50);
        System.out.println("linearSearch for 50 = " + foundIndex);
        

        int notFoundIndex = linearSearch(searchNumbers, 99);
        System.out.println("linearSearch for 99 = " + notFoundIndex);
        

        int firstElementIndex = linearSearch(searchNumbers, 10);
        System.out.println("linearSearch for 10 = " + firstElementIndex);
        

        System.out.println();

        
        int[] firstFiveSquares = squares(5);
        System.out.println("squares(5) = " + Arrays.toString(firstFiveSquares));
        

        int[] zeroSquares = squares(0);
        System.out.println("squares(0) = " + Arrays.toString(zeroSquares));
        

        int[] negativeSquares = squares(-3);
        System.out.println("squares(-3) = " + Arrays.toString(negativeSquares));

        System.out.println();

        int[] firstArray  = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        boolean isEqual = arraysEqual(firstArray, secondArray);
        System.out.println("arraysEqual({1,2,3}, {1,2,3}) = " + isEqual);
       

        int[] differentArray = {1, 2, 4};
        boolean isNotEqual = arraysEqual(firstArray, differentArray);
        System.out.println("arraysEqual({1,2,3}, {1,2,4}) = " + isNotEqual);
       

        int[] shorterArray = {1, 2};
        boolean isDifferentLength = arraysEqual(firstArray, shorterArray);
        System.out.println("arraysEqual({1,2,3}, {1,2}) = " + isDifferentLength);
    }
}












}
