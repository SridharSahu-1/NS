package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddOrEven {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);

                      int num1= sc.nextInt();
                      switch(num1%2){//this will return 0
case 0:
    System.out.println("Even");
    break;
case 1:
    System.out.println( "Odd");
}
    }
}