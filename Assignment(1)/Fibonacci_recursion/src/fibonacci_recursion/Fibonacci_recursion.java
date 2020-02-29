
package fibonacci_recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author henrick
 */
public class Fibonacci_recursion {
    private static final BigInteger[] fibonacci=new BigInteger[100000];
    static
    {
        fibonacci[0]=BigInteger.ONE;
        fibonacci[1]=BigInteger.ONE;
    }
    
    public static BigInteger fibo(int n)
    {
        if(fibonacci[n]==null)
        {
            fibonacci[n]=fibo(n-1).add(fibo(n-2));
        }
        return fibonacci[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The fibonacci number is "+fibo(n));
    }
}
    