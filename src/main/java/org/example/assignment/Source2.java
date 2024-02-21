package org.example.assignment;

import java.util.Scanner;
/*
3

1 2 3

4

4 5 6 7
* */
class Source2 {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        // write your code here
        for(int i: descendingMerge){
            System.out.println(i);
        }

    }
    public static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2){
        int[] T = new int[sortedArray1.length+sortedArray2.length];
        int l=sortedArray1.length-1,r=sortedArray2.length-1,k=0;
        while(l>=0 && r>=0){
            if(sortedArray1[l]>=sortedArray2[r]){
                T[k]=sortedArray1[l];
                l--;
            }else{
                T[k]=sortedArray2[r];
                r--;
            }
            k++;
        }
        while(l>=0){
            T[k]=sortedArray1[l];
            l--;
            k++;
        }

        while(r>=0){
            T[k]=sortedArray2[r];
            r--;
            k++;
        }
        return T;
    }

    public static int[] getArrayInput(int sizeArray, Scanner scanner){

        int[] array = new int[sizeArray];

        for(int i = 0; i < sizeArray; i++)
        {
            array[i]=scanner.nextInt();
        }

        return array;
    }
}

