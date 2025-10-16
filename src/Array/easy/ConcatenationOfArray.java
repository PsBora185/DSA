package Array.easy;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] concatenate(int[] nums){

        int n = nums.length;
        int[] arr = new int[n*2];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(Arrays.toString(concatenate(arr)));
    }
}
