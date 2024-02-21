package org.example;
import java.util.*;

public class QuickSort {
    private static int partition(int[] A, int start,int end){
        int pivot = A[end];
        int p = start;
        for(int i=start;i<end;i++){
            if(A[i]<=pivot){
                int temp = A[i];
                A[i] = A[p];
                A[p] = temp;
                p++;
            }
        }
        int temp = A[end];
        A[end] = A[p];
        A[p] = temp;
        return p;
    }

    public static void sort(int[] A,int start,int end){
        if(start<end){
            int pivot = partition(A, start, end);
            sort(A,start,pivot-1);
            sort(A,pivot+1, end);
        }
    }

    public static void main(String[] args){
        int[] A = {7,2,1,6,5,3,8,4};
        sort(A,0,A.length-1);
        for(int i:A){
            System.out.println(i);
        }
    }
}
