package fc.algoritm.inout;

import java.util.Scanner;

public class InOutSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;
        
        for (int i=0; i<s.length(); i++) {
        	sum += Integer.parseInt(s.substring(i, i+1));
        }
        
        System.out.println(sum);
    }

}