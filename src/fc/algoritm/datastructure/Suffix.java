package fc.algoritm.datastructure;

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
        
        for (int i = 0; i < arr.length; i++) {
			int x = arr[i].substring(0, 1).charAt(0);
        	for (int j=i+1; j< arr.length; j++) {
				int y = arr[j].substring(0, 1).charAt(0);

				if (x > y) {
					String t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					x = y;
				}
        	}
		}
        
        for (String v : arr) {
        	System.out.println(v);
        }
    }
}