package TwoPointers;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SortingInBinaryArray {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr= new int[N];
      for(int i=0;i<N;i++){
          arr[i]=sc.nextInt();
      }                  
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }
}