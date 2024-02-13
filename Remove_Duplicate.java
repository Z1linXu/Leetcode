public class Remove_Duplicate {
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
