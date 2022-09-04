package DatatypesVariables;

import java.util.Scanner;

public class NobitasTest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int Q = sc.nextInt();
        if(Q!=0){
            int val =D/Q;
            System.out.println(val);
        }
        else{
            System.out.println("-1");
        }
    }
}
