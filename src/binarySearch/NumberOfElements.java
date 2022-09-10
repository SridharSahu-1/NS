package binarySearch;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfElements {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      int N= sc.nextInt();
      int[] A = new int[N];
      for(int i=0;i<N;i++){
          A[i]=sc.nextInt();
      }
      Arrays.sort(A);  
      int k = sc.nextInt();
    for(int i=0;i<k;i++){
        int h = sc.nextInt();
        int count=0,low=0,high=N-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(A[mid]>h) high=mid-1;
            if(A[mid]<h) low=mid+1;
            if(A[mid]==h){
                count=(N-1)-mid;
                break;   }  }      
    if(low>high)count=N-low;
    System.out.println(count);  
    }

} }