package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MCQExam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int P =  sc.nextInt();
        int Q =  sc.nextInt();
        int R =  sc.nextInt();
        int S =  sc.nextInt();
        int sum = P+Q+R+S;
        if(sum==100){
            if(P>=Q && P>=R && P>=S){
                System.out.println(P);
            }
            else if(Q>=P && Q>=S && Q>=R){
                System.out.println(Q);
            }
            else if(R>=P && R>=S && R>=Q){
                System.out.println(R);
            }
            else{
                System.out.println(S);
            }
        }





    }
}