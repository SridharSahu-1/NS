package ControlStructure;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StudentsGrade {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
 int m1 = sc.nextInt();
 int m2 = sc.nextInt();
 int m3 = sc.nextInt();
 int m4 = sc.nextInt();
 int m5 = sc.nextInt();
 int marks = (m1 + m2 + m3 + m4 + m5) / 5;
 if(marks >= 80){
 System.out.print("A");
 }else if(marks >= 60){
 System.out.print("B");
 }else if(marks >= 40){
 System.out.print("C");
 }else{
 System.out.print("D");
 }

    }
}