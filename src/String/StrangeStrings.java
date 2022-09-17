package String;

import java.util.Scanner;

public class StrangeStrings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),a=97,ptr1,ptr2;
        char[] c = new char[num];
        if(num%2!=0){
            ptr1 = num/2;
            ptr2 = num/2+1;
        }
        else{
            ptr1 = num/2-1;
            ptr2 = num/2;
        }
        while(ptr1>=0){
            c[ptr1--]=(char)a;
            a++;
            if(a>122){a=97;}
            if(ptr2<num){c[ptr2++]=(char)a;}
            a++;
            if(a>122){a=97;}
        }
        for(int i=0;i<num;i++){
            System.out.print(c[i]);
        }

    }
}
