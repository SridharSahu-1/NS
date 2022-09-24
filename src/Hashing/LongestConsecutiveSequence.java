package Hashing;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestConsecutiveSequence {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
     int N=sc.nextInt();
     int[] arr = new int[N];
     int n = arr.length;
     for(int i=0;i<N;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println(longestConsecutive(arr));                   
    }
      public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
        int count=1;
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1 == nums[i+1]){
                count+=1;
                max = Math.max(max,count);
            } else {
                count = 1;
            }
        }
        return Math.max(max,count);
    }

}