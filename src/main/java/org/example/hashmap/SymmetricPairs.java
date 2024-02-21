package org.example.hashmap;

import java.util.Scanner;
import java.util.HashMap;

class SymmetricPairs {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        // if(arr.length==0){
        //     System.out.println("No Symmetric pair");
        // }
        boolean hasPair = false;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int x = arr[i][0];
            int y = arr[i][1];
            Integer value = h.get(y);
            if(value!=null && value==x){
                System.out.println(y+" "+x);
                hasPair = true;
            }else{
                h.put(x,y);
            }
        }
        if(!hasPair){
            System.out.println("No Symmetric pair");
        }

    }
}
