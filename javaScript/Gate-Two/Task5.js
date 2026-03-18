function boolean numIsPrime(let num) {
		if (num < 2) return false;
    		for (let index = 2; index < num; index++) {
       			 if (num % index == 0) return false;
    }
    	return true;
}
console.log(numIsPrime(11));   
console.log(numIsPrime(15));  
