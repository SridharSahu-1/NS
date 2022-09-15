package Sorting;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BubbleSort {
    public static void main (String[] args) {
                      // Your code here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int [n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();      }
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}