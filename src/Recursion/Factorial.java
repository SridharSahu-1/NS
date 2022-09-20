package Recursion;

public class Factorial {
    static int Factorial(int N){
//Enter your code here
        if(N<=1){
            return N;
        }
        return N*Factorial(N-1);
    }
}
