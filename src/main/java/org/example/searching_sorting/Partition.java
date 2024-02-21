package org.example.searching_sorting;
import java.util.*;

public class Partition {

    public static void printPosNeg(int n, int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int j : arr) {
            if (j >= 0) {
                list1.add(j);
            } else {
                list2.add(j);
            }
        }
        if(arr[0]>=0){
            print(list1);
            if(list2.size()<=0){
                System.out.println("No negative numbers");
            }else{
                print(list2);
            }

        }else{
            print(list2);
            if(list1.isEmpty()){
                System.out.println("No positive numbers");
            }else{
                print(list1);
            }
        }
    }
//  if 1st no is array is neg, add neg in list 1 else vice versa
    public static void partitionByFirstElement(int n, int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i:arr){
            if((arr[0] ^ i)<0){
                list2.add(i);
            }else{
                list1.add(i);
            }
        }
        print(list1);
        if(list2.isEmpty()){
            if(arr[0]>0){
                System.out.println("No negative numbers");
            }else {
                System.out.println("No positive numbers");
            }
        }
        else{
            print(list2);
        }
    }
    private static void print(ArrayList<Integer> arr){
        StringBuilder result = new StringBuilder();
        for (Integer integer : arr) {
            result.append(integer).append(" ");
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,6,7};
//        printPosNeg(5,arr);
        partitionByFirstElement(5,arr);
    }
}
