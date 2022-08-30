package BasicsofProgramming;

import java.util.Scanner;

public class StringTypecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        checkConevrtion(n);
    }

    static String checkConevrtion(int a) {
        // your code here
        String str = Integer.toString(a);
        return str;
    }
}