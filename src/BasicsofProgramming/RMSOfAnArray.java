package BasicsofProgramming;

import java.util.Scanner;

public class RMSOfAnArray {
    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        int i;
        int n;
        double sum=0.0;
        n=mj.nextInt();
        int[] arr = new int[100];
        for(i=0;i<n;i++){
            arr[i]=mj.nextInt();
            sum+=(arr[i]*arr[i]);
        }
        System.out.printf("%6f",Math.sqrt(sum/n));

    }
}
