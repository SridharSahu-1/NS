package ControlStructure;

public class NarutoAndSasuke {
    static char Race(int A,int B,int C){
        int n1=Math.abs(C-A);
        int n2=Math.abs(C-B);
        char ans ='a';
        if(n1>n2){
            ans='S';
        }
        if(n1<n2){
            ans='N';
        }
        if(n1==n2){
            ans='D';
        }
        return ans;
    }
}
