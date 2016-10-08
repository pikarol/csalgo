//LexicographicGenerator//
package lexicographicgenerator;

public class LexicographicGenerator {

    public static void main(String[] args) {
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numset = "1234567890";
        for(int i = 0; i < charset.length(); i++){
        System.out.println(charset.charAt(i));
    }
        for(int a = 0; a < numset.length(); a++){
            System.out.println(numset.charAt(a));
        }
    }
    
}
