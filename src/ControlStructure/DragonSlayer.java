package ControlStructure;

public class DragonSlayer {
    static int DragonSlayer(int A, int B, int C,int D){
//Enter your code here
        while(A >= 0 && C >= 0){
            A= A - D;
            if(A <= 0){
                break;
            }
            C = C - B;
            if(C <= 0){
                break;
            }
        }
        if(C <= 0){
            return 0;
        }else{
            return 1;

        }
    }
}
