/* Generate all Pythagorean triplet with values smaller than a given limit .
    Limit = 20 
    And Pythagorean triplet satisfy the condtion  a^2 + b^2 = c^2 

*/
import java.util.* ;

public class Q2{
    public static void pythagoranTriplet(int limit){
        
        for(int a = 1 ; a<=limit ;a++){
            for(int b =a ; b<=limit ; b++){
                int cSquare = a*a + b*b ;
                int c = (int) Math.sqrt(cSquare) ;
                if(c<=limit && c*c == cSquare){
                    System.out.println(a+" "+b+" "+c) ;
                }
            }
        }
    }

    public static void main(String[]args){
        pythagoranTriplet(20) ;

    }
}

