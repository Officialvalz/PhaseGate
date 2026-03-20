def is_prime(number):
    if number <= 1:
        return False
    for divisor in range(2, int(number ** 0.5) + 1):
        if number % divisor == 0:
            return False
    return True

def sorted_primes(numbers):
    primeCount = 0
    for currentNumber in numbers:
        if is_prime(currentNumber):
            primeCount += 1

    primeArray = [0] * primeCount
    position = 0
    for currentNumber in numbers:
        if is_prime(currentNumber):
            primeArray[position] = currentNumber
            position += 1

    primeArray.sort()
    return primeArray

print(sorted_primes([5, 9, 3, 6, 2]))
