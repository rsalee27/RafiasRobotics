public class FIRSTJAVA 
{

    public static void main(String arg[]) 
    {

        System.out.println("Hello from Rafia");
        System.out.println("I am working on the Multiplication table now");

        int n = 12, i, j;

        for (i=1; i<=n; ++i) // row counter

        {   if (i==1)
            {
            System.out.print("\t");
            System.out.print("\t ");
            for (j=1; j<=n; ++j) // print 1 to n
            
                {   
                    System.out.print(j);
                    System.out.print(" ");
                }
            }
            
            System.out.print("\n");
            System.out.print(i);
            System.out.print("\t");

                for (j=1; j<=n; ++j) // print i*1 to i*n
            
                {   
                    System.out.print(j*i);
                    System.out.print("\t");
                }
            
        }    

    }
}
