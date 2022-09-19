package String;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ResultantString {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      char[] c = new char[N];
                      String str1 = sc.next();
                      String str2 = sc.next();
                      for(int i=0;i<N;i++){
                          if(str1.charAt(i)!=str2.charAt(i))
                           c[i]='1';
                          else c[i]='0'; 
                      }
                      for(int i=0;i<N;i++){
                      System.out.print(c[i]);}
        }
         }