package org.example;

import java.util.Scanner;
public class LinearSearch {

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            //Declare the array here

            int count = input.nextInt();
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = input.nextInt();
            }
            int key = input.nextInt();
            input.close();
            //write your code here
            for(int i=0;i<count;i++){
                if(array[i]==key){
                    System.out.println("i"+i);
                    int b= count-1-i;
                    System.out.print(b);
                    break;
                }
            }

        }

}
