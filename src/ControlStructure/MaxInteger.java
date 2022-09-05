package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxInteger {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if(a > b && a > c){
 System.out.println(a);
 }else if(b > c){
 System.out.println(b);
 }else{
 System.out.println(c);
 }

    }
}