package Loops_1DArray;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindElementAfterRotation {
    public static void main (String[] args) {
                      // Your code here
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            b[i]=in.nextInt();
      int c=in.nextInt();
        for(int j=0;j<c;j++)
        {
            int d=in.nextInt();
            int e=in.nextInt();
            rotate(b,d-1,e-1);
        }
        System.out.print(b[a-1]);
  

    }
    static void rotate(int a[], int low,int high)   
    {   
      int g=a[high]; 
        int i;  
      for (i = high; i > low; i--)   
          a[i] = a[i - 1];       
      a[low] = g;
    }
}