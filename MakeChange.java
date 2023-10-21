import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Double;
 
public class MakeChange 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double cost=0, itemprice=0;
        double paid;
        int ones;
        int fives;
        int tens;
        int twenties;
        int hundreds;
        int pennies, nickels, dimes, quarters;
        float DecimalFormat;

        System.out.println("Hi. Welcome to the MakeChanger. I will help you make change.");
        System.out.println("Please enter the price of your item(s).");
                cost = scanner.nextDouble();
        System.out.println("Please enter the amount paid:");
                paid = scanner.nextDouble();

        double change = paid - cost;
        DecimalFormat df1 = new DecimalFormat("0.00");

        System.out.println("Your change is $" + df1.format(change) + ".");
 
            //int changeInt = (int) change;
            //change = change - changeInt;
            //System.out.println("Change in dollar: " + changeInt);
    if (paid>cost)
    {
        hundreds = (int) Math.round(change)/100;
        change = change % 100;

        twenties = (int) Math.round(change)/20;
        change = change % 20;

        tens = (int) Math.round(change)/10;
        change = change % 10;

        fives = (int) Math.round(change)/5;
        change = change % 5;

        ones = (int) Math.floor(change);
        change = change % 1;

        quarters = (int)(change/ 0.25);
        change = change % .25;

        dimes = (int)(change/ 0.10);
        change = change % .10;

        nickels = (int)(change/ 0.05);
        change = change % .05;

        pennies = (int)(change/ 0.01);
        change = change % .01;

        System.out.println("Change in 100s: "+ hundreds);
        System.out.println("Change in 20s: "+ twenties);
        System.out.println("Change in 10s: "+ tens);
        System.out.println("Change in 5s: "+ fives);
        System.out.println("Change in 1s: "+ ones);
        System.out.println("Change in Quarters: "+ quarters);
        System.out.println("Change in Dimes: "+ dimes);
        System.out.println("Change in Nickels: "+ nickels);
        System.out.println("Change in Pennies: "+ pennies);
    }
    else if(paid==cost)
    {
      System.out.println("No Change is due");  
    }
    else
    {
      System.out.println("Please pay more ...");    
    }
/* 
        if(change<1) {
            change %.25==0;
            System.out.println(" " + quarters + "quarters");
            else if (change %.25!=0){
                change %.10;
                else if (change%.10!=0) {
                    change %.05;
                    else (change%.05!=0) {
                        change %.01;
                    }
                }
            }
        }
 
        System.out.println(" " + hundreds + "hundred-dollar bills");
        System.out.println(" " + twenties + "twenty-dollar bills");
        System.out.println(" " + tens + "ten-dollar bills");
        System.out.println(" " + fives + "five-dollar bills");
        System.out.println(" " + ones + "one-dollar bills");
        System.out.println(" " + quarters + "quarters");
        System.out.println(" " + dimes + "dimes");
        System.out.println(" " + nickels + "nickels");
        System.out.println(" " + pennies + "pennies");
        System.out.println("Thank you for your cooperation.");

        */

    }
}
