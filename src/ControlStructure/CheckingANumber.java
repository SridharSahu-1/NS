package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckingANumber {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n<0){
           System.out.println("Negative");
       }
       if(n>0){
           System.out.println("Positive");
       }
       if(n==0){
           System.out.println("Zero");
       }
          
       }
    }