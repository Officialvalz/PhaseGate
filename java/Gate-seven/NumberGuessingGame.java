import java.security.SecureRandom;
public class NumberGuessingGame {

    public static int generateNumber() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(100) + 1;
    }

    public static String checkNumberOfGuess(int secret, int guess) {
        if (guess < secret) return "LOW😠️ ";
        if (guess > secret) return "HIGH😡️ ";
        return "CORRECT✅️ ";
    }

    public static String getRated(int attempts, boolean won) {
        if (!won) return "No Win....Better luck Next Time😥️ ";

        switch (attempts) {
            case 1: return "Legendary🥳️ ";
            case 2: return "Excellent😎️ ";
            case 3:
            case 4: return "Good🤗️";
            case 5: return "Your Very Close!😒️ ";
            default: return "";
        }
    }


    public static boolean isValidRange(int number) {
        return number >= 1 && number <= 100;
    }
}
