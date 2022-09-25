package Hashing;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FirstNonRepeatingCharacterInString {
    public static void main (String[] args) {
                      // Your code here
     Scanner in = new Scanner (System.in);
        String s = in.next();
        System.out.println(getIndex1(s));          
    }
   
static int getIndex1(String s){
HashMap<Character,Integer> hm = new HashMap<>();
for(int i=0;i<s.length();i++){
    char c= s.charAt(i);
    hm.put(c,hm.getOrDefault(c,0)+1);
}
for(int i=0;i<s.length();i++){
    char c= s.charAt(i);
    if(hm.get(c)==1){
        return i;
    }
}
return -1;
}




}