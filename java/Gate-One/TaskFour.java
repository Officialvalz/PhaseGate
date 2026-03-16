import java.util.Scanner;
public class TaskFour{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	
	int product = 0;

	for (int count = 0; count < 2; count++){  
	System.out.print("Enter a Number: ");
	int num = input.nextInt();
	product = num * num;
	
	}
	System.out.println("product " + product);
	
	
	}
}
