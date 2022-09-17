package String;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RevString {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      String str1=sc.nextLine();
      String str2="";
      for(int i=str1.length()-1;i>=0;i--){
        str2= str2+str1.charAt(i);
      }                
    System.out.println(str2);
    }
}