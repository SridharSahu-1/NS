package DatatypesVariables;

import java.util.Scanner;

public class Dishes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int val= N-T;
        System.out.println(val);
    }
}
