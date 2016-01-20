package fc.algoritm.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Suffix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        int size = a.length();
        String[] arr = new String[size];
        int count = 0;
        
        for (int i = size-1; i >= 0 ; i--) {
			arr[count] = a.substring(size - 1 - i);
	        count++;
		}
        
//        for (int i = 0; i < arr.length; i++) {
//        	for (int j=i+1; j< arr.length; j++) {
//
//				if (arr[i].compareTo(arr[j]) > 0) {
//					String t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//        	}
//		}

        Arrays.sort(arr);                                                                                                  

        
        for (String v : arr) {
        	System.out.println(v);
        }
    }
}