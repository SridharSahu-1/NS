package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CountUniqueElements {
        static int Hashset(String[] arr){
            HashSet<Integer> hs = new  HashSet<Integer>();
            for(int i=0;i<arr.length;i++){
                hs.add(Integer.parseInt(arr[i]));
            }
            return hs.size();
        }

        public static void main (String[] args)throws Exception {
            // Your code here
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            int n= Integer.parseInt(sc.readLine());
            String[] arr = sc.readLine().split(" ");
            System.out.println(Hashset(arr));
            sc.close();
        }

    }

