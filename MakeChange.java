import java.util.Scanner;

public class MakeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paid = 0.0;
        while (true) {
            System.out.println("Hi. Welcome to the MakeChanger. I will help you make change.");
            System.out.println("Enter the price of an item or 'd' when done:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("d")) {
                break;
            }
            paid += Double.parseDouble(input);
        }

        System.out.println("Enter the amount of cash given:");
        double cost = Double.parseDouble(scanner.nextLine());
        double change = cost - paid;
        
        int ones, fives, tens, twenties, hundreds;
        int pennies, nickels, dimes, quarters;

        if (cost > paid) {
            hundreds = (int) (change / 100);
            change = change % 100;

            twenties = (int) (change / 20);
            change = change % 20;

            tens = (int) (change / 10);
            change = change % 10;

            fives = (int) (change / 5);
            change = change % 5;

            ones = (int) (change);
            change = change % 1;

            quarters = (int)(change / 0.25);
            change = change % 0.25;

            dimes = (int)(change / 0.10);
            change = change % 0.10;

            nickels = (int)(change / 0.05);
            change = change % 0.05;

            pennies = (int)(change / 0.01);

            System.out.println("Change in 100s: " + hundreds);
            System.out.println("Change in 20s: " + twenties);
            System.out.println("Change in 10s: " + tens);
            System.out.println("Change in 5s: " + fives);
            System.out.println("Change in 1s: " + ones);
            System.out.println("Change in Quarters: " + quarters);
            System.out.println("Change in Dimes: " + dimes);
            System.out.println("Change in Nickels: " + nickels);
            System.out.println("Change in Pennies: " + pennies);

       } else if(cost == paid) {
           System.out.println("No Change is due");
       } else {
           System.out.println("Please pay more...");
       }
    }
}
