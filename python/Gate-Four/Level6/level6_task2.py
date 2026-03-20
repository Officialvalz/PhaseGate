def nums_palindrome(numbers):
    firstindex = 0
    secondindex = len(numbers) - 1

    while firstindex < secondindex:
        if numbers[firstindex] != numbers[secondindex]:
            return False
        firstindex += 1
        secondindex -= 1
    return True
