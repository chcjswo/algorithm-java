import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
	        String s = sc.nextLine();
	        
	        for (int i=0; i<s.length(); i++) {
	        	if (i >0 && i%10 == 0) {
	        		System.out.println("");
	        		System.out.print(s.charAt(i));
	        	} else {
	        		System.out.print(s.charAt(i));
	        	}
	        }
        }
    }

}