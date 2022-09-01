package DatatypesVariables;

import java.util.Scanner;

public class SimpleSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }


}
