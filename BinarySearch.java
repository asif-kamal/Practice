public class BinarySearch {
    public static int search(int[] nums, int target) {
        int i = 0;
        while (nums[i] != target && i < nums.length) {
            if (i == nums.length - 1) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        System.out.println(search(nums, target));
    }
}
