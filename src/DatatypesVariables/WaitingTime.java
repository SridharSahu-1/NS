package DatatypesVariables;

import java.util.Scanner;

public class WaitingTime {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int val= N*X;
        System.out.println(val);
    }
}
