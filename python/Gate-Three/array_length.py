def array_length(old_size, new_size):
    result = []

    for number in range(old_size):
        if number < len(old_size):
            total.append(old_size[number])  
        else:
            total.append(-1)         

    return total

old_size = [10, 11, 12]
put_in = array_length(old_size, 5)
print("Total:", put_in)
