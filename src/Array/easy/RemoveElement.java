package Array.easy;

import java.util.Arrays;

public class RemoveElement {

    // every other elements then val should be in first k of array , k is count of elements after removing val
    public static int remove(int[] nums, int val){

        int k = nums.length-1;
        int i = 0;

        while (i <= k){
            if (nums[i] == val){
                nums[i] = nums[k];
                k--;
            } else
                i++;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        System.out.println(remove(arr,2));
    }
}
