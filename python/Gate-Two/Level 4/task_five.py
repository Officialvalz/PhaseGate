def num_is_prime(num):
	if num < 2:
		return False
	for number in range(2, num):
		if num % number == 0:
			return True
			return False
print(num_is_prime(17))   
print(num_is_prime(15)) 
