package Sorting;

public class BubbleSortInPairArray {

class Pair {
    int x;
    int y;

    // Constructor
public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}


    static Pair[] SortPair(Pair arr[], int n)  {
        //enter your code here

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].x < arr[j].x){
                    Pair temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else if(arr[i].x == arr[j].x){
                    if(arr[i].y < arr[j].y){
                        Pair temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

        }
        return arr; }
}
