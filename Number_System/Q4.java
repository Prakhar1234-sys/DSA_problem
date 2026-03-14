/* 
  Write a function to solve the following equation a³ + a²b + 2a²b + 2ab² + ab² + b³.
 Write a program to accept three values in order of a, b and c and get the result of the above equation.
    
*/

import java.util.* ;
class Q4{
    public static void solveEquation(int a,int b ,int c){
        int result = (a*a*a+b*b*b+a*a*b+a*b*b+2*a*a*b+2*a*b*b) ;
        System.out.println("(a+b)^3 :"+result) ;
    }
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in) ;
         System.out.print("a :");
        int a = sc.nextInt() ;
        System.out.print("b :") ;
        int b = sc.nextInt() ;
        System.out.print("c :") ;
        int c = sc.nextInt() ;
        solveEquation(a,b,c) ;
        
    }
}
