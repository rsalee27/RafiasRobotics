import java.math.BigInteger;

public class Factorial {
 
    public static void main(String[]args) {

        for (int i=1; i<101; i++){
            BigInteger facto = BigInteger.valueOf(1);
            for(int j = i; j > 1; --j) {
                facto = BigInteger.valueOf(j).multiply(facto);
            }
            System.out.println(facto);
        }
    }
}
