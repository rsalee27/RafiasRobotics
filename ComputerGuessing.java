import java.util.Random; 
import java.util.Scanner; 
  

public class ComputerGuessing{

	public static void main(String[] args)
    {

		 // stores actual and guess number 
         int answer; 
         int guess;
  
         // maximum value is 100 
        int maxv = 100; 
        int minv = 1;
 
       // takes input using scanner 
       Scanner in = new Scanner(System.in); 

       // Random instance 
       Random rand = new Random(); 
       
      // correct answer = computer guess
       guess = rand.nextInt(maxv) + 1; 

       System.out.println("Computer guess is: " + guess);

       boolean correct = false; 

       // loop until the guess is correct 
       while (!correct) { 
         
         // Set the average of min and max as guess
          answer = (minv + maxv) / 2;

           System.out.println( 
               "Enter the current average as answer "+ answer); 
           answer = in.nextInt();
         
           // if guess is greater than actual 
           if (guess > answer) { 
               System.out.println("Too low, try again"); 
               minv = answer;
           } 
 
           // if guess is less than actual 
           else if (guess < answer) { 
               System.out.println("Too high, try again"); 
               maxv = answer;
           } 
 
           // guess is equal to actual value 
           else { 
 
               System.out.println( 
                   "Yes, you guessed the number."); 
 
               correct = true; 
           } 
       } 
       System.exit(0); 
    }
}

   
        
    

			