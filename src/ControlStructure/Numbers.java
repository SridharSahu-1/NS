package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Numbers {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
 if (n <= 5){
 switch(n){
 case 1:
 System.out.print("one");
 break;
 case 2:
 System.out.print("two");
 break;
 case 3:
 System.out.print("three");
 break;
 case 4:
 System.out.print("four");
 break;
 case 5:
 System.out.print("five");
 break;
 default:
 }
 }else{
 System.out.print("Greater than 5");
 }                
    }
}