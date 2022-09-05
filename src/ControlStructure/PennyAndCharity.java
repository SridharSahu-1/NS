package ControlStructure;

public class PennyAndCharity {
    static int Charity(int N, int M){

        if(N > M || N== M || M < 2 * N){
            return -1;
        }else{
            int found_cloth = M / N;
            return found_cloth;
        }
    }
}
