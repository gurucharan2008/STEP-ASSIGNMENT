/**
 * Week 4 - A5: Find Minimum in Rotated Sorted Array
 * Modified binary search – O(log n) time
 */
public class A5_FindMinRotatedSorted {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with the rightmost element to decide which half has the minimum
            if (nums[mid] > nums[right]) {
                // Minimum is in the right half (excluding mid)
                left = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                right = mid;
            }
        }

        // left == right → the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        // Sample 1
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums1)); // 1

        // Sample 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2)); // 0

        // Sample 3 (no rotation)
        int[] nums3 = {11, 13, 15, 17};
        System.out.println(findMin(nums3)); // 11
    }
}
