import java.util.Scanner;
public class TaskEight{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int nums = 0;
	int count = 0;
	while (count <= 100){ 
	System.out.print("Enter a Number, but 0 to break out: ");
	nums = input.nextInt();
	count++;
			

	if ( nums == 0){
			break;
}
else {
	continue;
}

}		
	}
}

