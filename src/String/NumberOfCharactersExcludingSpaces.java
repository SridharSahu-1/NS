package String;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfCharactersExcludingSpaces {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else{
                count++;
            }
        }
System.out.println(count);
    }
}