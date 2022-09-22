package Recursion;

import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    public static int test(long []arr,long k,  int i, long sum) {
         if(arr.length==i){
            if(sum==k){   
                return 1;   }
            else{
                return 0;   }
        }
        int a=test(arr,k,i+1,sum-arr[i]);
       if(a==1){
           return a;    }
        int b=test(arr,k,i+1,sum+arr[i]);
        return b;        }


    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            long k=sc.nextLong();

            long []arr=new long [N];

            for(int i=0;i<N;i++){
                arr[i]=sc.nextLong();
            }
            


            if(test(arr,k,1,arr[0])==1){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }


    }
}