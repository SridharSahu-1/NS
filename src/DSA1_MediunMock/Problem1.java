package DSA1_MediunMock;

public class Problem1 {
        /* Problem 1: Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
    Example:
    Input : arr[] = {0, 2, 1, 2, 0}
    Output : 0 0 1 2 2
    Explanation: 0s 1s and 2s are segregated into ascending order.
    */
        public static void main(String args[]) {
            int[] arr ={0,2,1,2,0};
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }


        }
    }


