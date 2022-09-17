package String;

import java.util.Scanner;

public class CheckWhiteSpaces {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.nextLine();
          if(c.contains(" ")){
        System.out.println("Yes");
    }
          else{
        System.out.println("No");
    }
}
}
