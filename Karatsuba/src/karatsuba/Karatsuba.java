package karatsuba;

import java.util.Scanner;


public class Karatsuba {

  
    public static void main(String[] args) {
        String x, y;
        int a, b, c, d, ac, ad, bc, bd, answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scan.nextLine();
        System.out.println("Enter y: ");
        y = scan.nextLine();
        System.out.println("x:"+x+" , "+"y:"+ y);
        a = Integer.parseInt(x.substring(0, 2));
        b = Integer.parseInt(x.substring(2, 4));
        c = Integer.parseInt(y.substring(0, 2));
        d = Integer.parseInt(y.substring(2, 4));
        System.out.println("A and B = " +a+" "+b);
        System.out.println("C and D = " +c+" "+d);
        ac = a * c;
        ad = a * d;
        bc = b * c;
        bd = b * d;
        
        System.out.println("AC = "+ac +" "+"AD = "+ad +" "+"BD = "+bc +" "+"BD = "+bd+" ");
        
        answer =  ac * 10000;
        answer += ((ad+bc)*100);
        answer += bd;
        System.out.println("Answer = "+answer);
    }
    
}
