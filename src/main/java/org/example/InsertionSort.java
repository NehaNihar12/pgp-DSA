package org.example;

public class InsertionSort {

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int v = arr[i];
            int j;
            j = i;
            while(j>=1 && arr[j-1]>v){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = v;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,8,44,3,2,1};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
