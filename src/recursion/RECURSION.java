
package recursion;

import java.util.Scanner;

public class RECURSION {

    public static int Print(int n){
       if(n==0) {
           return 0;
       } else {
           System.out.println("*");
           return Print(n-1);
       }
        
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = scn.nextInt();
        Print(size);

    }
    
   
       
    
}
