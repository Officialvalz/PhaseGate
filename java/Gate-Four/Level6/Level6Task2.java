public class Level6Task2 {

    static boolean numIsPalindrome(int[] numbers) {
        int firstIndex = 0;
        int secondIndex = numbers.length - 1;

        while (firstIndex < secondIndex) {
            if (numbers[firstIndex] != numbers[secondIndex]) {
                return false;
            }
            firstIndex++;
            secondIndex--;
        }
        return true;
    }
}
