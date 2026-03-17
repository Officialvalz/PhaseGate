public class Task5{ 
	static boolean numIsPrime(int num) {
		if (num < 2) return false;
    		for (int index = 2; index < num; index++) {
       			 if (num % index == 0) return false;
    }
    	return true;
}
public static void main(String...args) {
    System.out.println(numIsPrime(11));   
    System.out.println(numIsPrime(15));  
}
}
