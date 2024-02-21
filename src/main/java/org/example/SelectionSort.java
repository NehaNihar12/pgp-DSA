package org.example;

public class SelectionSort {

    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            boolean isSorted = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    min=j;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
    public void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args){
        SelectionSort s = new SelectionSort();
        int[] arr = {2,3,6,8,1};
        s.sort(arr);
        s.print(arr);
    }
}
