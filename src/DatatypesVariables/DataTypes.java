package DatatypesVariables;

import java.util.Scanner;

public class DataTypes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        float c = sc.nextFloat();
        double d = sc.nextDouble();
        char e = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.printf("%.2f\n", c);
        System.out.printf("%.4f\n", d);
        System.out.println(e);

    }
    }
