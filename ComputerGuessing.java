import java.util.Scanner;

public class ComputerGuessing{

	public static void main(String[] args){

		System.out.println("Think of a whole number betwen 1 and 100. I'll guess what it is!");
		System.out.println("When you're ready, type yes and press enter.");

		Scanner scanner = new Scanner(System.in);
		//ignore the yes
		scanner.nextLine();

		int min = 1;
		int max = 100;

		int guesses = 0;
		boolean done = false;
		while(!done){

			int guess = min + (int)(Math.random() * (max - min + 1));
			guesses++;

			System.out.println("My guess is: " + guess);
			System.out.println("Please type yes if I got it right.");
			System.out.println("Please type higher if your number is greater than " + guess + ".");
			System.out.println("Please type lower if your number is less than " + guess + ".");
			System.out.println("Then press enter.");

			String answer = scanner.nextLine();

			if(answer.equals("lower")){
				max = guess - 1;
			}
			else if(answer.equals("higher")){
				min = guess + 1;
			}
			else{
				System.out.println("Hooray!");
				System.out.println("It took me " + guesses + " guesses to get it right. Thanks for playing!");
				done = true;
			}
		}
		scanner.close();
	}
}

        
    

			
