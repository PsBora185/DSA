package Array.medium;

public class mergeSort {

    public static void divide(int[] nums, int l, int h){
        if (l>=h)
            return;

        divide(nums,l,(h+l)/2);
        divide(nums,(h+l)/2+1,h);

        merge(nums,l,(h+l)/2,h);
    }

    public static void merge (int[] nums, int l,int m, int h){

        int[] temp = new int[h-l+1];

        int i = l;
        int j = m+1;
        int k = 0;

        while (i <= m && j <= h){
            if (nums[i] < nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }

        while (i <= m) temp[k++] = nums[i++];
        while (j <= h) temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, l, temp.length);
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int n : nums)
            System.out.print(n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 3, 1};

        print(arr);
        divide(arr, 0, arr.length - 1);
        print(arr);
    }
}
