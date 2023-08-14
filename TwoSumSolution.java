public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i=0; i < nums.length; i++) {
            for (int j=0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    return arr;
}

public static void main(String[] args) {
    int[] nums = {2,4,11,3};
    int target = 6;

    twoSum(nums, target);
}
}