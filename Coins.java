
package pesobill;

import java.util.Scanner;


public class PesoBill {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double value;
        double ten;
        double five;
        double peso;
        double cents;
        
        
        System.out.print("Enter value: ");
        value = scan.nextDouble();
        
        ten = (int)value / 10;
        System.out.println("Tens: "+ten );
        value %= 10;
        
        five = (int) value / 5;
        System.out.println("Five: " +five);
        value %= 5;
        
        peso = (int) value / 1;
        System.out.println("Peso: " +peso);
        value %= 1;
        
        cents =  value / .25;
        System.out.println("Cents: " +cents);
    }
    
}
