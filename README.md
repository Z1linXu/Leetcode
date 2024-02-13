Array/String


## **[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)**
### Question:
* You are given two integer arrays nums1 and nums2, sorted in **non-decreasing order**, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
* **Merge** nums1 and nums2 into a single array sorted in **non-decreasing order**.
  The final sorted array should not be returned by the function, but instead be *stored inside the array* nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### Answer:
**Problem Solving Idea:**
The approach involves setting two pointers to represent the progress of two arrays. When the element at Pointer 1 is less than or equal to that at Pointer 2, insert the element from Pointer 1 into a new array. If either pointer has completely traversed its respective array, then directly insert the remaining elements from the other array into the new array. Finally, replace nums1 with this newly formed array.
### Complexity
- Time complexity: O(m+n)

- Space complexity:O(m+n)

### Code
```
class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        for(int i = 0; i < m + n; i++ ){
            if(nums1Pointer== m){
                nums3[i]= nums2[nums2Pointer];
                nums2Pointer++;
            }
            else if(nums2Pointer== n){
                nums3[i]= nums1[nums1Pointer];
                nums1Pointer++;
            }
           else  if(nums1[nums1Pointer] <nums2[nums2Pointer] || nums1[nums1Pointer] == nums2[nums2Pointer])
            {
                nums3[i]=nums1[nums1Pointer];
                nums1Pointer++;
            }
            else{
                nums3[i]=nums2[nums2Pointer];
                nums2Pointer++;
            }

        }
        for(int i =0; i< m+n; i++){
            nums1[i] = nums3[i];
        }
    }
    }


```


# 2. Remove Element


## Intuition
Creat a new array and pointer, using for loop to filter the array, for loop will continue if val is equal to one of the array. Finally copy new array into old array



## Complexity
- Time complexity:
  O(n)
- Space complexity:
  O(n)
## Code
```
class Solution {
    public int removeElement(int[] nums, int val) {
    int pointer = 0;
    // 创建新数组
    int[] newNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val) {
            continue;
        } else {
            newNums[pointer] = nums[i];
            pointer++;
        }
    }
    for (int i = 0; i< nums.length; i++){
        nums[i] = newNums[i];
    }
    return pointer;
    }
}
```

# 3. Remove Duplicates from Sorted Array


## Intuition
Creat a new array and pointer, using for loop to filter the array, for loop will continue if val is equal to the previous value. Finally copy new array into old array



## Complexity
- Time complexity:
  O(n)
- Space complexity:
  O(n)
## Code
```
class Solution {

    public int removeDuplicates(int[] nums) {
        int k=0; // the number of unique elements of nums to be k
        int[] newNums = new int[nums.length];
        for(int i = 0; i< nums.length; i++)
        {
            if(i==0){
                newNums[i] = nums[i];
                k++;
            }
            else{
                if(nums[i]== newNums[k-1])
                {
                    continue;
                }
                else{
                    newNums[k] = nums[i];
                    k++;
                }
            }
        }
         for (int i = 0; i< nums.length; i++){
            nums[i] = newNums[i];
        }
        return(k);
    }
}
```