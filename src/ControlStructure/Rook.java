package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Rook {
    public static void main (String[] args) {
                      // Your code here
   Scanner sc = new Scanner(System.in);
 int X = sc.nextInt();
 int Y = sc.nextInt();
 if(X != 1 && Y != 1){
 System.out.print(2);
 }else if(X == 1 && Y == 1){
 System.out.print(0);
 }else{
 System.out.print(1);
 }
    }
}