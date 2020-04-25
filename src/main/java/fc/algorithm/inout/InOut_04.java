package fc.algorithm.inout;

import java.util.Scanner;

public class InOut_04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
