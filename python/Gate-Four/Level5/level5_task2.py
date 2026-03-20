def replace_negatives(numbers):
    result = [0] * len(numbers)
    for index in range(len(numbers)):
        if numbers[index] < 0:
            result[index] = 0
        else:
            result[index] = numbers[index]
    return result
