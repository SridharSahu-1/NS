package Maths;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PrimeSum {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int k=0;k<T;k++){
    int l = sc.nextInt();
    int r = sc.nextInt();
    int count=0;
    int sum;
    int sop=0;
    for(int i=l;i<=r;i++){
        sum=0;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                sum=1;
                break;}
        }
        if(sum==0){
            sop+=(i/10)%10;
        }
    }                  
    System.out.println(sop);
    }
}
}