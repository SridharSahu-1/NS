package ControlStructure;

public class SarasPhone {
    static int Phone(int N, int K, int M){
//Enter your code here
        double A = (double) M / (double) K;
        if(A<N) {
            return (int) Math.ceil(A);
        }else{
            return -1;
        }

    }
}
