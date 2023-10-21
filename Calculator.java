import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Select an operator: +, -, *, /, or s");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Input your first number");
    number1 = input.nextDouble();
    number2=1.0; //initial value

    if(operator!='s'){

      System.out.println("Input your second number");
      number2 = input.nextDouble();
   } 
   
    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

        // performs square root between numbers
        case 's':
         // the value of number2 is 1
         System.out.println("√" + number1 + " = " + Math.sqrt(number1));
         break;
    }


    input.close();
  }
}