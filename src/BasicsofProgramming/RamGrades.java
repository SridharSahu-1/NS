package BasicsofProgramming;

import java.util.Scanner;

public class RamGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float totalmarks = a+b+c+d;
        float percentage = totalmarks/400*100;
        System.out.println((int)percentage);

    }
}
