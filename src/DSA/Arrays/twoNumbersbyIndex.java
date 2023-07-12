package DSA.Arrays;

public class twoNumbersbyIndex {


    public static void main(String[] args) {
        int[] nums = {7, 3, 5, 4, 9};
        int[] ans = main(nums,9);
        System.out.println(ans);
    }

    public static int[] main(int[] nums, int target) {

        for(int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

}
