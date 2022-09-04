package VariablesOperators;

import java.util.Scanner;

public class StepsExecution {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int add = num + 8;
        int div = add / 3;
        int modu = div % 5;
        int mul = modu * 5;
        System.out.print(mul);
    }
}
