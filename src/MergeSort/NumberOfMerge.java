package MergeSort;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfMerge {
    static void merge(int arr[], int low, int mid, int high) {
        int idx1 = low;
        int idx2 = mid + 1;
        int X = 0;
        int[] merged = new int[high - low + 1];
        while (idx1 <= mid && idx2 <= high) {

            if (arr[idx1] < arr[idx2]) {
                merged[X++] = arr[idx1++];
            } else {
                merged[X++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[X++] = arr[idx1++];
        }
        while (idx2 <= high) {
            merged[X++] = arr[idx2++];
        }
        for (int i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println(N-1);
    }
}