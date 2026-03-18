def find_largest_2d(numbers):
    largest = numbers[0][0]
    for index in range(len(numbers)):
        for nums in range(len(numbers[index])):
            if numbers[index][nums] > largest:
                largest = numbers[index][nums]
                
    return largest
