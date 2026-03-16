import java.util.Scanner;
public class TaskTwo{
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("How old are you: ");
	int age = input.nextInt();
	
	if (age == 1){
		System.out.println("you will be 6 years old in 5yrs time");
	}
	
	if (age == 10){
		System.out.println("you will be 16 years old in 5yrs time");
	}
	
	}
}
