/*Raj wants to know the maximum marks scored by him in each semester. The marks should be between 0 -100 ; if 
 it goes beyond the range display . "You are entered invalid marks"  
*/

import java.util.* ;
// class Q3{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in) ;
//         System.out.print("Enter no. of semester :") ;
//         int sem = sc.nextInt() ;
//         int sub = 0 ;
//         for(int i = 1; i<=sem ;i++){
//             System.out.print("Enter no of Subject in "+(i+1)+" "+"Semester :") ;  
//             int sub = sc.nextInt() ;
//         }



      
//     }
// }
class Q3{
    public static void maxMarksPerSemester() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int sem = sc.nextInt();
        int[] subjects = new int[sem];
        for (int i = 0; i < sem; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjects[i] = sc.nextInt();
        }
        for (int i = 0; i < sem; i++) {
            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            int max = Integer.MIN_VALUE;
            boolean invalid = false;
            for (int j = 0; j < subjects[i]; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    invalid = true;
                    System.out.println("You have entered invalid mark.");
                    break;
                }
                if (mark > max) max = mark;
            }
            if (!invalid)
                System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
        }
    }

    public static void main(String[]args){
        maxMarksPerSemester() ;
    }
}    
