package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TicTakToe {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
 char c1 = sc.next().charAt(0);
 char c2 = sc.next().charAt(0);
 if(c1 == 'R' || c2 == 'R'){
 System.out.print("R");
 }else if(c1 == 'J' || c2 == 'J'){
 if(c1 == 'J'){
 System.out.print(c2);
 }else{
 System.out.print(c1);
 }
 }else{
 System.out.print("D");
 }

    }
}