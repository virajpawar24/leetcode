class Solution {
    public int  maxProduct(int[] nums) {
        int n  =nums.length;
        long large = Long.MIN_VALUE;
        for(int i = 0;i<n;i++){
            long product = 1;
            for(int j = i;j<n;j++){
                product *= nums[j];

               large = Math.max(large , product);
            }
        }
        return (int)large;
    }
}