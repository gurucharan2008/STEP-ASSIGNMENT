/**
 * Week 4 - A2: Maximum Subarray
 * Kadane's algorithm – O(n) time, O(1) space
 */
public class A2_MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Extend current subarray or start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // Sample 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums1)); // 6

        // Sample 2 (all negative)
        int[] nums2 = {-3, -1, -2};
        System.out.println(maxSubArray(nums2)); // -1
    }
}
