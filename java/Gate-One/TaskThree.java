import java.util.Scanner;
public class TaskTwo{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;

	for (int count = 0; count < 2; count++){  
	System.out.print("Enter a Number: ");
	int num = input.nextInt();
	sum = num + sum;
	
	}
	System.out.println("Sum " + sum);
	
	
	}
}
