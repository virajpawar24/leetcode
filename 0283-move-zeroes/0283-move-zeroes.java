class Solution {
    public void moveZeroes(int[] nums) {
        int lnz = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lnz]=nums[i];
                lnz++;
            }
        }
        for(int i =lnz;i<nums.length;i++){
            nums[i] =0;
        }
    }
}