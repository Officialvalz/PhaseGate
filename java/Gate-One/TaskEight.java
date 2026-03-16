import java.util.Scanner;
public class TaskFour{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	
	int square = 0;

	System.out.print("Enter a Number: ");
	int num = input.nextInt();
	square = num * num;
	
	System.out.println("Square " + square);
	
	
	}
}
