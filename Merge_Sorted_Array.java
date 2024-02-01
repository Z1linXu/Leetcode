public class Merge_Sorted_Array {
    /**
     * Problem-solving ideas: What I thought of as the fastest way to solve the problem at the beginning
     * was to set two pointers corresponding to two arrays, and use a for loop to insert it into a new
     * array if one of the arrays is equal to or less than When the upper limit is reached, it means
     * that one of the data has been checked, and the next pointer is replaced to fill the array.
     * The last forloop is then filled into nums1.
     *
     * Time Complexity: O(m+n)
     * Space Complexity: O(m+n)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        // Two Pointer
        int nums1Pointer = 0;
        int nums2Pointer = 0;

        for(int i = 0; i < m+n ; i++ ){
            //if nums1 has been completely inserted
            if(nums1Pointer== m){
                nums3[i]= nums2[nums2Pointer];
                nums2Pointer++;
            }
            //if nums2 has been completely inserted
            else if(nums2Pointer== n){
                nums3[i]= nums1[nums1Pointer];
                nums1Pointer++;
            }
            //insert nums1 into nums3 if it's smaller or equal than nums2
           else  if(nums1[nums1Pointer] <nums2[nums2Pointer] || nums1[nums1Pointer] == nums2[nums2Pointer])
            {
                nums3[i]=nums1[nums1Pointer];
                nums1Pointer++;
            }
           //insert nums2 into nums3
            else{
                nums3[i]=nums2[nums2Pointer];
                nums2Pointer++;
            }

        }
        // copy the result back to nums1
        for(int i =0; i< m+n; i++){
            nums1[i] = nums3[i];
        }
    }
}
