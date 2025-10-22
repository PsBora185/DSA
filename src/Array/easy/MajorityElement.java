package Array.easy;

public class MajorityElement {

    // majority element is more than n/2 times
    public static int find(int[] nums){
        int e = -1;
        int count = 0;

        for (int n : nums) {

            if (count == 0)
                e = n;

            if (n == e)
                count++;
            else
                count--;
        }

        return e;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};

        System.out.println(find(arr));
    }
}
