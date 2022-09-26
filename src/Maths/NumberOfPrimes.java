 package Maths;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfPrimes {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
count++;
        }
    }                  
    System.out.println(count);
    }
    static boolean isPrime(int n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 
}