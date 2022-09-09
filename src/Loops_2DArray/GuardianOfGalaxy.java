package Loops_2DArray;

import java.util.*; // contains Collections framework
class GuardianOfGalaxy {
        static long infy = Integer.MAX_VALUE;
    static int N =111111;
    static int n;
    static int[] arr = new int[N];
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
                      n = sc.nextInt();
                      //int[] arr = new int[n];
                      for (int i=1; i<=n; i++) {
                          arr[i] = sc.nextInt();
                      }
                      System.out.println(calcThrust(arr));
    }

    static boolean check (long m) {
        long thrust = m;
        for (int i=1; i<=n; i++) {
            thrust = 2*thrust - arr[i]; 
            if (thrust>=infy) return true;
            if (thrust < 0) {
                return false;
            }
        }
        return true;
    }

    static long calcThrust(int[] arr) {
        long left = 0;
        long right = infy;
        long ans = 0;

        while (left<right) {
            long mid  = (left+right)/2;

            if (check(mid)) {
                right = mid;
                ans = mid;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }
}