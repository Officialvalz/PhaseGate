function boolean numIsPalindrome(let[] numbers) {
        let firstIndex = 0;
        let secondIndex = numbers.length - 1;

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
