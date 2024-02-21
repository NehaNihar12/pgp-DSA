package org.example.searching_sorting;
import java.util.*;
public class MaximumOccuringElement {

    public static void main(String[] args) {
        int[] array = {4, 4,5, 2, 5, 2, 8, 1, 7, 2, 6};
        int n = array.length;
        int c = BoyerMooreMajorityVoteAlgorithm(array);
        System.out.println(c);
    }

    public static int BoyerMooreMajorityVoteAlgorithm(int[] array){
        int candidate = -1;
        int count = 0;

        for (int element : array){
            if (count == 0){
                candidate = element;
                count = 1;

            }
            else if (candidate == element)
                count = count + 1;
            else
                count = count - 1;
        }
        // At this point, 'candidate' is a potential majority element
        // Now, verify if 'candidate' is the majority element
        count = 0;
        for (int element : array){
            if (candidate == element)
                count = count + 1;
        }
//        if (count > array.length / 2)
            return candidate;
//        else
//            return -1;



    }
}