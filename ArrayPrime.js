function isPrime(number) {
    if (number <= 1) {
        return false;
    }
    for (let divisor = 2; divisor <= Math.sqrt(number); divisor++) {
        if (number % divisor === 0) {
            return false;
        }
    }
    return true;
}

function sortedPrimes(numbers) {
    let primeCount = 0;
    for (let currentNumber of numbers) {
        if (isPrime(currentNumber)) {
            primeCount++;
        }
    }

    let primeArray = new Array(primeCount).fill(0);
    let position = 0;
    for (let currentNumber of numbers) {
        if (isPrime(currentNumber)) {
            primeArray[position] = currentNumber;
            position++;
        }
    }

    primeArray.sort((firstNum, secondNum) => firstNum - secondNum);
    return primeArray;
}

console.log(sortedPrimes([5, 9, 3, 6, 2]));
