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

        // Print the total cost of the items
        System.out.println("The total cost of the items is: " + String.format("%.2f", paid));

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

             if (hundreds > 0) {
                System.out.println("Change in 100s: " + hundreds);
            }
             if (twenties > 0) {
                System.out.println("Change in 20s: " + twenties);
            }
            if (tens > 0) {
                System.out.println("Change in 10s: " + tens);
            }
            if (fives> 0) {
                System.out.println("Change in 5s: " + fives);
            }
            if (ones > 0) {
                System.out.println("Change in 1s: " + ones);
            }
            if (quarters > 0) {
                System.out.println("Change in Quarters: " + quarters);
            }
            if (dimes > 0) {
                System.out.println("Change in Dimes: " + dimes);
            }
            if (nickels > 0) {
                System.out.println("Change in Nickels: " + nickels);
            }
            if (pennies > 0) {
                System.out.println("Change in Pennies: " + pennies);
            }

       } else if(cost == paid) {
           System.out.println("No Change is due");
       } else {
           System.out.println("Please pay more... You still owe: " + String.format("%.2f", paid - cost));
       }
       }
    }
