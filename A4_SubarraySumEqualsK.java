import java.util.HashMap;
import java.util.Map;

/**
 * Week 4 - A4: Subarray Sum Equals K
 * Prefix sum + HashMap frequency, O(n) time
 */
public class A4_SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        // Map: prefixSum → how many times it has occurred
        Map<Integer, Integer> prefixCount = new HashMap<>();
        // Empty prefix (sum 0) occurs once before any elements
        prefixCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) was seen before, those prefixes form valid subarrays
            if (prefixCount.containsKey(currentSum - k)) {
                count += prefixCount.get(currentSum - k);
            }

            // Record this prefix sum
            prefixCount.put(currentSum, prefixCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Sample 1
        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2)); // 2

        // Sample 2
        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0)); // 3
    }
}
