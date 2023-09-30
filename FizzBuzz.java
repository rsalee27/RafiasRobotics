public class FizzBuzz {
    
   public static void main(String[]args)
   {

    System.out.println("Hello, Rafia here.");
    System.out.println("Printing numbers from 0-100 now.");

    for(int i=0; i<100; i++) 
    {

        if(i%15==0)
        {
            System.out.println("FizzBuzz");
        }    
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }    
        else if(i%3==0)
        {
            System.out.println("Fizz");
        }    
    
        else if(i%10==3 || i==31) 
        {
            System.out.println("Fizz"+i);
        }    
        else
        {
            System.out.println(i);
        }
    }    
}
}
            