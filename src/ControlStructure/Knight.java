package ControlStructure;

public class Knight {
    static int Knight(int X, int Y){
        int count = 0;
        if(ans(X+1,Y+2)){
            count++;
        }if(ans(X+1,Y-2)){
            count++;
        }if(ans(X-1,Y+2)){
            count++;
        }if(ans(X-1,Y-2)){
            count++;
        }if(ans(X+2,Y-1)){
            count++;
        }if(ans(X+2,Y+1)){
            count++;}if(ans(X-2,Y+1)){
            count++;
        }if(ans(X-2,Y-1)){
            count++;
        }
        return count;
    }
    static boolean ans(int a, int b){
        if(a <= 8 && a >=1 && b <= 8 && b >= 1){
            return true;
        }else{
            return false;
        }
    }
}
