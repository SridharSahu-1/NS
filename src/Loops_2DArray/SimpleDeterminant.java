package Loops_2DArray;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SimpleDeterminant {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      int [][] A = new int[2][2];
      int determinant=0;
      for(int i=0;i<2;i++){
          for(int j=0;j<2;j++){
           A[i][j]= sc.nextInt();     
          }
        determinant = A[0][0]*A[1][1]-A[0][1]*A[1][0];
      }  
System.out.println(determinant);
    }
}