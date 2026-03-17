import java.util.Scanner;
public class TaskFour{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	
	int nums = 0;
	int count = 1;
	while (count < 2){ 
	System.out.print("Enter a Number: ");
	 nums = input.nextInt();
	count++;
	}
	
	System.out.println(nums + " x " + nums + " = " + (nums * nums));
	
	
	
	}
}
