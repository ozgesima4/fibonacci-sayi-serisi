
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("sayi:");
       int n=input.nextInt();
       int x=0,y=1,toplam;
       
        for (int i = 0; i < n; i++) {
            System.out.println(x);
           toplam=x+y;
           x=y;
           y=toplam;
            
        }
        
       
        
    }
    
}
