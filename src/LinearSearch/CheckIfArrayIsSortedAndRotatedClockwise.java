package LinearSearch;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfArrayIsSortedAndRotatedClockwise {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
                      int tc = sc.nextInt();

                      for(int i=0;i<tc;i++){
                          int size=sc.nextInt(),count=0;
                          int[] arr = new int[size];
                          for(int j=0;j<size;j++){
                              arr[j] = sc.nextInt();
                          }
                          if(arr[0]>arr[size-1]){
                          for(int k=1;k<size;k++){
                              if(arr[k]>arr[k-1]){continue;}
                              count++;
                          }
                          if(count==1) System.out.println("Yes");
                          else System.out.println("No");
                          }

                          if(arr[0]<arr[size-1]){
                          for(int k=1;k<size;k++){
                              if(arr[k]<arr[k-1]){continue;}
                              count++;
                          }
                          if(count==1) System.out.println("Yes");
                          else System.out.println("No");
                          }
                      }
    }
}