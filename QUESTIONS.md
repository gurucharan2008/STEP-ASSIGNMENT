# Week 4 – Category C Assignment Problems (Arrays)

## A1. Product of Array Except Self

**Task:** Return an array where `answer[i]` is the product of every element except `nums[i]`. No division. O(n) two-pass (left products + right products).

**Method:** `int[] productExceptSelf(int[] nums)`

**Sample**
```
[1, 2, 3, 4]      →  [24, 12, 8, 6]
[-1, 1, 0, -3, 3] →  [0, 0, 9, 0, 0]
```

---

## A2. Maximum Subarray (Kadane’s Algorithm)

**Task:** Find the contiguous subarray with the largest sum. Handle all-negative arrays.

**Method:** `int maxSubArray(int[] nums)`

**Sample**
```
[-2, 1, -3, 4, -1, 2, 1, -5, 4]  →  6
[-3, -1, -2]                     →  -1
```

---

## A3. 3Sum

**Task:** Find all unique triplets that sum to 0. Sort + two-pointer, skip duplicates.

**Method:** `List<List<Integer>> threeSum(int[] nums)` (or `int[][]`)

**Sample**
```
[-1, 0, 1, 2, -1, -4]  →  [[-1, -1, 2], [-1, 0, 1]]
[0, 0, 0]              →  [[0, 0, 0]]
```

---

## A4. Subarray Sum Equals K

**Task:** Count how many contiguous subarrays sum to exactly `k`. Use prefix sums + HashMap.

**Method:** `int subarraySum(int[] nums, int k)`

**Sample**
```
[1, 1, 1], k=2   →  2
[1, -1, 0], k=0  →  3
```

---

## A5. Find Minimum in Rotated Sorted Array

**Task:** Find the minimum element in a rotated sorted array of unique elements. Modified binary search – O(log n).

**Method:** `int findMin(int[] nums)`

**Sample**
```
[3, 4, 5, 1, 2]       →  1
[4, 5, 6, 7, 0, 1, 2] →  0
[11, 13, 15, 17]      →  11
```
