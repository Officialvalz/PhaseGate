 import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int sumOfNumbers = 0;
	int nums = 0;
	int count = 1;
	while (count <= 2){ 
	System.out.print("Enter a Number: ");
	 nums = input.nextInt();
	count++;
			
	sumOfNumbers = nums + nums;	
	}		
	System.out.println("The Sum Of Numbers is: " + sumOfNumbers);	
		
	}
}

