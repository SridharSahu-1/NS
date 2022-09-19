package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class OddOccurring {
            public static void main (String[] args) {
                // Your code here
                int i;
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] arr = new int[N];
                for(i=0;i<N;i++){
                    arr[i] = sc.nextInt(); }
                Arrays.sort(arr);
                for(i=0;i<N-1;i+=2){
                    if(arr[i]!=arr[i+1]){
                        System.out.println(arr[i]);
                        break;}
                }
                if(i==N-1) System.out.println(arr[i]);

            }
        }


