import java.util.Scanner;
public class TaskFive{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int nums = input.nextInt();

		int result = 1;

		for (int index = 1; result  <= nums; index++) {
		result = result * index;
	}
	
	System.out.println("Factorial of " + nums + ": " + result);

}
	}

