package fc.algorithm.math;
import java.util.Scanner;

public class Factorial_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();

        System.out.println(factorial(a));
    }

    public static long factorial(long x) {
    	if (x <= 1)
    		return x;

    	return x * factorial(x - 1);
    }
}
