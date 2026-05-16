class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int cnt = 0;
        int pdct = 1;

        if(k <= 1) return 0;

        for(int right = 0; right < nums.length; right++) {

            pdct *= nums[right];

            while(pdct >= k) {
                pdct /= nums[left];
                left++;
            }

            cnt += right - left + 1;
        }

        return cnt;
    }
}