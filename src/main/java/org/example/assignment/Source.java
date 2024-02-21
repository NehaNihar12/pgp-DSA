package org.example.assignment;

import java.util.Scanner;

class Source {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Write your code here
        /*
          1. search index1 of misplaced Element in array1
          2. sort the array2 using nlogn complexity
          3. search the index2 with least value in array2, i.e. array1[index1-1]<index2< array1[index1+1]
         */
        int index = search(array1);
        sort(array2,0,array2.length-1);
        int prevValue = array1[index-1];
        int nextValue = array1[index+1];
        int index2 = comparativeSearch(array2,prevValue,nextValue);
        if(index2!=-1){
            System.out.print(array2[index2]);
        }else{
            System.out.print("Not Possible");
        }

    }

    public static int comparativeSearch(int[] array2, int prevValue, int nextValue) {
        int low = 0;
        int high = array2.length - 1;

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array2[mid] > prevValue && array2[mid] < nextValue) {
                result = mid;
                return result;
                // Continue searching in the left half for a better candidate
//                high = mid - 1;
            } else if (array2[mid] >= nextValue) {
                // Current element is greater than or equal to nextValue,
                // so search in the left half
                high = mid - 1;
            } else {
                // Current element is less than or equal to prevValue,
                // so search in the right half
                low = mid + 1;
            }
        }

        return result;
    }


    public static int search(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] A,int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(A,start,mid);
            sort(A,mid+1,end);
            merge(A,start,mid,end);
        }
    }
    private static void merge(int[] A, int start,int mid,int end){
        int l = start;
        int r = end;
        int k = 0;
        int[] T = new int[A.length];
        while(l<=mid && r<=end){
            if(A[l]<=A[r]){
                T[k] = A[l];
                l++;
            }else{
                T[k] = A[r];
                r++;
            }
            k++;
        }
        while(l<=mid){
            T[k]=A[l];
            l++;
            k++;
        }
        while(r<=end){
            T[k]=A[r];
            r++;
            k++;
        }

        //   copying elements from T to A
        l=start;
        k=0;
        while(l<=end){
            A[l] = T[k];
            l++;
            k++;
        }
    }
}
