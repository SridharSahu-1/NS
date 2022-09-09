package Loops_2DArray;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfPrimes {
    static int prime(int n){
       int count =1;
       int i,j;
       for(i=3;i<=n;i++){
            for(j=2;j<i;j++)
                if(i%j==0)
                break;
                if(i==j)
                count++;
       }
       return count;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
      for(int i=0;i<n;i++){
          int x = sc.nextInt();
          System.out.println(prime(x));
         }

    }
}