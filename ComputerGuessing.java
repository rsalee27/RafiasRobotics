import java.util.Scanner;

public class ComputerGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guesses = 0;

        System.out.println("Think of a number between " + low + " and " + high + ".");
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("Is your number " + mid + "? Enter 'higher', 'lower', or 'yes'.");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("higher")) {
                low = mid + 1;
            } else if (response.equals("lower")) {
                high = mid - 1;
            } else if (response.equals("yes")) {
                System.out.println("Great! I guessed your number in " + guesses + " guesses.");
                break;
            } else {
                System.out.println("Sorry, I didn't understand that. Please enter 'higher', 'lower', or 'yes'.");
            }
            guesses++;
        }
        scanner.close();
    }
}
			
