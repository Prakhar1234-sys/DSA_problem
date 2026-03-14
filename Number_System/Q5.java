/*
    A function is there which tells how many dealerships there are and the total number of cars and bike in each
dealership.
Your job is to calculate how many tyres would be there in each dealership.
*/

import java.util.* ;

class Q5{
    public static void calculateTyres(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Total dealerships :") ;
        int dealership = sc.nextInt() ;
        int i = 0 ;
        while(i<dealership){
            System.out.print("dealership "+(i+1)+" contains cars & bike :") ;
            int cars = sc.nextInt() ;
            int bikes = sc.nextInt() ;
            
            int tyres = (cars*4)+(bikes*2) ;
            System.out.println("Toatal number of tyres in dealership "+(i+1)+":"+tyres) ;
            i++ ;
        }


    }

    public static void main(String[]args){
        calculateTyres() ;
    }
}

