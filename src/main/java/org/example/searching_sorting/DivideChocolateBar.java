package org.example.searching_sorting;
//import java.util.*;
//
// class DivideChocolateBar {
//    public static int numberOfSubArrays(int[] arr, int n, int d, int m){
//        int count =0;
//        for(int i =0;i<=n-m;i++){
//            int sum=0;
//            for(int j=i;j<i+m;j++){
//                sum+=arr[j];
//            }
//            if(sum==d)
//                count++;
//        }
//        return count;
//
//    }
//    public static void main(String[] args){
//        int[] chocolateBar = {1,4, 3, 5, 6,4};
//        int n = numberOfSubArrays(chocolateBar,6,18,4);
//        System.out.println(n);
//    }
//}
import java.util.*;

public class DivideChocolateBar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    // Method to find number of subarrays of size m whose sum of elements is d
    static void numberOfSubArrays(int[] arr,int n, int d, int m){
        // Write your code here
        int count=0,oldSum=0,newSum = 0;
        for(int i=0;i<m;i++){
            oldSum+=arr[i];
        }
        if(oldSum==d) count++;

        for(int i=m;i<n;){
            newSum=oldSum-arr[i-m]+arr[i];
            if(newSum==d) count++;
            oldSum = newSum;
            i=i+m;
        }
        System.out.println(count);
    }
}