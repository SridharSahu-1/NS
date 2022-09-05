package ControlStructure;

import java.util.Scanner;
class LeapYear {
   public static void main (String[] args)
   {
       Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 if((N % 400 == 0) || ((N % 4 == 0) && (N % 100 != 0))){
 System.out.println("YES");
 }else{
 System.out.println("NO");
 }
   }
}