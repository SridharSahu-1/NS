package String;

public class Multiplication {

    static int  Multiply_by_recursion(int M, int N)
    {
        int resultat = 0;
        for (int i = 0; i < M; i++) {
            resultat += N;
        }
        return resultat;
    }

}
