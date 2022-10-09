package Practice;

import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
//        [10, 20, 10, 20, 30, 20, 20]
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr ={10,20,10,20,30,20,20};
        int count=0;
        for(int temp:arr){
            if(hm.containsKey(temp)){
               hm.put(temp , hm.getOrDefault(temp,0)+1);
            }
            else{
                hm.put(temp,1);
            }
        }

        System.out.println(hm);
    }
}
