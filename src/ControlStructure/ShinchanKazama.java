package ControlStructure;

import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class ShinchanKazama {
 public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);
 int A = sc.nextInt();
 int B = sc.nextInt();
 int S = sc.nextInt();

 int Destance = Math.abs(A - B);
 int V = Destance / S;
 System.out.print(V);
 }
}