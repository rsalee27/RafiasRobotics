public class Factorial {
    public static void main(String[]args)
    
    {
    int n, i, fact=1;
    n= 6 // I'm finding the factorial of 5.
    for(i=n; i>1; --i) {

        fact=fact*i;
    }
    System.out.print(fact);
    }
}
