package Array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static int[] find(int[] nums, int sum) {  // max n*(n-1)/2 -> O(n^2)

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int n = sum - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(i + " " + j);
                if (nums[j] == n) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
            System.out.println();
        }
        return arr;
    }

    public static int[] ts(int[] nums, int sum) {

        HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = sum - nums[i];

            if (h.containsKey(diff)) {
                arr[0] = h.get(diff);
                arr[1] = i;
                return arr;
            }

            h.put(nums[i], i);
        }

        return arr;
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 8, 9};
        print(arr);
        System.out.println(Arrays.toString(ts(arr, 17)));
    }
}
