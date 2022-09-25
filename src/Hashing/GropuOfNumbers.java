package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;
// don't change the name of this class
// you can add inner classes if needed
class GropuOfNumbers
{

        static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

// logical merthod or calling method
    static void Map(int [] nums)
    {
        HashMap<Integer, Integer> Hm = new HashMap<>();
      

      for(int i = 0; i < nums.length; i++)
      {
          int g = nums[i];
          Hm.put(g,Hm.getOrDefault(g,0)+1);
      }

        List<Entry<Integer, Integer>> hm = sortByValue (Hm);
      
       for(Entry<Integer, Integer> i : hm)
           System.out.print(i.getKey()+" ");            

       
    }
// This method used to sort an Hashmap based on values
    public static List<Entry<Integer, Integer>>
    sortByValue(HashMap<Integer, Integer> Hm)
    {
       List<Entry<Integer, Integer>> list = 
       new LinkedList<Entry<Integer, Integer>>(Hm.entrySet());
     
       Collections.sort(list,(e1,e2)->
       {
            if(e1.getValue() != e2.getValue())
                return e2.getValue() - e1.getValue();

            else
              return e2.getKey() - e1.getKey();
       });

     return list;
    }

// main method
    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
      int n  = sc.nextInt();
      int [] nums = new int [n];

      for(int i=0; i<n; i++)
          nums[i] = sc.nextInt();

        Map(nums);
    }
}