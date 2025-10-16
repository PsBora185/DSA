package Array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean checkDuplicate(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for(int n : nums){
            if(!numSet.add(n)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        System.out.println(checkDuplicate(arr));
    }
}
