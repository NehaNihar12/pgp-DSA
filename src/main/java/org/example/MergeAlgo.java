package org.example;

import java.util.stream.IntStream;

public class MergeAlgo {

    public static void mergeSort(int[] A){
        int n = A.length;
        if(n<2)
            return;
        int mid = n/2;
        int[] L = new int[mid];
        int[] R = new int[n-mid];


        IntStream.range(0, mid).forEach(i -> L[i] = A[i]);

        IntStream.range(mid, n).forEach(i -> R[i - mid] = A[i]);

        mergeSort(L);
        mergeSort(R);
        merge(L,R,A);
    }

    public static void merge(int[] L, int[] R, int[] A){
        int l= 0, r= 0, k=0;
        while(l<L.length && r<R.length){
            if(L[l]<=R[r]){
                A[k] = L[l];
                l++;
            }else{
                A[k] = R[r];
                r++;
            }
            k++;
        }
        while(l<L.length){
            A[k] = L[l];
            l++;
            k++;
        }
        while(r<R.length){
            A[k] = R[r];
            r++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] A = {8,6,3,1,4,2,7,5};
        mergeSort(A);
        for (int j : A) {
            System.out.println(j);
        }

    }
}
