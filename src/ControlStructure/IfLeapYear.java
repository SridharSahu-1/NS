package ControlStructure;

import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class IfLeapYear {
 public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 if((N % 400 == 0) || ((N % 4 == 0) && (N % 100 != 0))){
 System.out.println("YES");
 }else{
 System.out.println("NO");
 }
 }
}