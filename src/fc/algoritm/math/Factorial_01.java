package fc.algoritm.math;
import java.util.Scanner;

public class Factorial_01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println(factorial(a));
    }
    
    public static int factorial(int x) {
    	if (x <= 1) 
    		return x;
    	
    	return x * factorial(x - 1);
    }
}