function let[] replaceNegatives(let[] numbers) {
        let[] result = new let[numbers.length];
        
        for (let index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0) {
                result[index] = 0;
                
            } else {
                result[index] = numbers[index];
            }
        }
        return result;
    }
}
