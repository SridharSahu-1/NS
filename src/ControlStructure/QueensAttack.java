package ControlStructure;

public class QueensAttack {
    static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
        if (X == P){
            return 1;
        }if (Y == Q){
            return 1;
        }
        int a = Math.abs(X - P);
        int b = Math.abs(Y - Q);
        if (a == b){
            return 1;
        }
        return 0;
    }
}
