package Sorting;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ImplementingInsertionSort {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int k=1;
    while(k<=T){
    int N = sc.nextInt();
    int[] arr = new int[N];
    for(int i=0;i<N;i++){
        arr[i]= sc.nextInt();
    }
    insertion(arr);
   for(int i=0;i<arr.length;i++){
       
        System.out.print(arr[i]+" ");
    }
    System.out.println("");
   k++; }
}
public static void insertion(int[] arr){
          int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
}

}
}