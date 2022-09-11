package binarySearch;

import java.util.*; // contains Collections framework
class FindIt {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     long K = sc.nextLong();
     long start=0,end=(long)Math.sqrt(K);
     long ans= -1;
     long mid = start +(end-start)/2;
     while(start<=end){
        long assume =(mid*mid)+(3*mid);
        if(K==assume){
            ans=mid;
        break;}
        if(K<assume)end=mid-1;
        else{
        start=mid+1;
        }
        mid = start +(end-start)/2;
    }
    System.out.println(ans);
    }
}