package Practice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 1, 4, 12, 31, 20};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;}
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merged(left, right);
    }

//    private static int[] merge(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//        int i = 0;int j = 0;int k = 0;
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];  i++;
//            } else {
//                mix[k] = second[j]; j++;}
//            k++;}
//        while (i < first.length) {
//            mix[k] = first[i];
//            i++;    k++;}
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;k++;}
//        return mix; }
    private static int[] merged(int[] left, int[] right) {
    int[] mix=new int[left.length+right.length];
    int i=0,k=0,j=0;
    while(i<left.length && j<right.length){
        if(left[i]<right[j]){
            mix[k]=left[i++];
        }
        else{
            mix[k]=right[j++];
        }k++;
    }
    while(i<left.length){
        mix[k++]=left[i++];
    }
        while(j<right.length){
            mix[k++]=right[j++];
        }
        return mix;
    }
}