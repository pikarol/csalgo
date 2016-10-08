
package strassen;

import java.util.Scanner;


public class Strassen {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1, m2, m3, m4, m5, m6, m7;
        int a00, a01, a10, a11, b00, b01, b10, b11, c00, c01, c10, c11;
        System.out.println("Enter numbers: ");
        a00 = scan.nextInt();
        a01 = scan.nextInt();
        a10 = scan.nextInt();
        a11 = scan.nextInt();
        b00 = scan.nextInt();
        b01 = scan.nextInt();
        b10 = scan.nextInt();
        b11 = scan.nextInt();
        
        
       m1 = (a00 + a11) * (b00 + b11);
       m2 = (a10 + a11) * b00;
       m3 = a00 * (b01 - b11);
       m4 = a11 * (b10 - b00);
       m5 = (a00 + a01) * b11;
       m6 = (a10 - a00) * (b00 + b01);
       m7 = (a01 - a11) * (b10 + b11);       
       
       
       c00 = m1 + m4 - m5 + m7;
       c01 = m3 + m5;
       c10 = m2 + m4;
       c11 = m1 + m3 - m2 + m6;
        System.out.println("Results:");
        System.out.println("c00:" +c00);
        System.out.println("c01:" +c01);
        System.out.println("c10:" +c10);
        System.out.println("c11:" +c11);
        
    }
    
}
