package org.example;
import java.util.Random;
import java.util.Arrays;

class QuickSort2 {
    //Write your code here
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14 ,16,18,20};
        sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void sort(int[] arr, int start, int end){
        if(start<end){
            int p= partition(arr, start,end);
            sort(arr,start,p-1);
            sort(arr,p+1,end);
        }
    }

    private static int partition(int[] A, int start, int end){
        random(A,start,end);
        int pivot = A[end];
        int p=start;
        for(int i=start;i<end;i++){
            if(A[i]>=pivot){
                int temp = A[i];
                A[i] = A[p];
                A[p]= temp;
                p++;
            }
        }
        int temp = A[end];
        A[end] = A[p];
        A[p]= temp;

        return p;
    }

    private static void random(int[] arr, int low, int high)
    {

        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;

        int temp1=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }

}
