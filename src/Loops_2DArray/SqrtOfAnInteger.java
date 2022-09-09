package Loops_2DArray;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SqrtOfAnInteger {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=1;i<=T;i++){
        int N=sc.nextInt();
        System.out.println((int)(Math.sqrt(N)));
    }                  
    }
}