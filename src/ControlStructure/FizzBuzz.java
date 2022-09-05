package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FizzBuzz {
    public static void main (String[] args) {
                      // Your code here
   Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 for (int i=1; i<=N; i++){
 if (i%15==0){
 System.out.print("FizzBuzz ");
 }else if (i%5==0){
 System.out.print("Buzz ");
 }else if (i%3==0){
 System.out.print("Fizz ");
 }else{
 System.out.print(i +" ");
 }
 }
    }
}