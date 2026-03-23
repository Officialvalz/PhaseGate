//				Pseudocode:
//give users different  random subtraction numbers to try and give correct answers.
//remove any question that will result to negative results.
//arrange questions in a proper order and formart.
//show the user each question in an orderly manner.
//questions will not be more than 10 and user must attempt all 10 question, wether they answer right or wrong.
//each question the user should be allowed to try twice.
//and at the end of everything, the wrong and right answer the user entered will be displayed so they see their final result.
//
//
//
//
//
//
//
import java.util.Scanner;
import java.security.SecureRandom;

public class SimpleArithmeticsCalculator{
	public static void main(String...args){
	 
	Scanner input = new Scanner(System.in);
	SecureRandom random = new SecureRandom();
	int score = 0;
	System.out.println("Welcome To My Simple Arithmetic Calculator ========== Would You Love To Try?  ");
	System.out.println("The question is from 1 - 10 and you have two tries on every question😜️");
	
  for (int count = 1; count <= 10; count++) {
            int num1 = random.nextInt(90) + 10;
            int num2 = random.nextInt(num1 + 1);

            System.out.println(count + num1 + num2);

            for (int attempt = 1; attempt <= 2; attempt++) {
                int ans = scanner.nextInt();
                if (ans == num1 - num2) {
                    System.out.println("✓ Correct!");
                    score++;
                    break;
                } else if (attempt < 2) {
                    System.out.print("pls try again you didnt get it right: ");
                } else {
                    System.out.println("youve answered correctly " + (num1 - num2));
                }
	}
	
}
	}

}
