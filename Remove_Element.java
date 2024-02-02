public class Remove_Element {

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