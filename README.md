Array/String


## **[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)**
### Question:
* You are given two integer arrays nums1 and nums2, sorted in **non-decreasing order**, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
* **Merge** nums1 and nums2 into a single array sorted in **non-decreasing order**.
  The final sorted array should not be returned by the function, but instead be *stored inside the array* nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### Answer:
**Problem Solving Idea:**
The approach involves setting two pointers to represent the progress of two arrays. When the element at Pointer 1 is less than or equal to that at Pointer 2, insert the element from Pointer 1 into a new array. If either pointer has completely traversed its respective array, then directly insert the remaining elements from the other array into the new array. Finally, replace nums1 with this newly formed array.
