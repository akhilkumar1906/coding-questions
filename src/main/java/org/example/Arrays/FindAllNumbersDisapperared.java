package org.example.Arrays;

/*
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

 */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisapperared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        int[] temp = new int[n + 1];
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            temp[arr[i]]++;
        }

        for(int i = 1; i < temp.length; i++){
            if(temp[i] == 0)
                result.add(i);
        }

        System.out.println(result);

    }
}
