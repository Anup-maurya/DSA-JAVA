public class Main {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.print("Input: ");
        printArray(nums1);
        moveZeroes(nums1);
        System.out.print("Output: ");
        printArray(nums1);
        System.out.println();
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
