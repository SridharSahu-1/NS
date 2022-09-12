package binarySearch;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MedianOfTwoSortedArrays {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int len=sc.nextInt()+sc.nextInt();
                      //double k = (double)len/2;
                     // System.out.println(k);
                      double m1;
                      int[] arr = new int[len];
                      for(int i=0;i<len;i++){
                          arr[i] = sc.nextInt();
                      }
                      Arrays.sort(arr);
                      if(len%2==0){
                           m1=(double)(arr[(len-1)/2]+(arr[(len-1)/2+1]))/2;
                           System.out.printf("%.2f",m1);}
                      else{
                           m1=(arr[(len-1)/2]); 
                           System.out.printf("%.2f",m1);}
    }
}