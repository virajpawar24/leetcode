class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n  = nums.length;
        if(n<k){
            return -1;
        }
        //compute first window sum
        int windowsum = 0;
       // int avg  =0;
        for(int i = 0;i<k;i++){
            windowsum +=nums[i];
        }
            int maxsum = windowsum;
        //we slide our window further by 1 element
        for(int i = k;i<n;i++ ){
            windowsum += nums[i] - nums[i-k];
            maxsum = Math.max(maxsum,windowsum);
           // avg  = maxsum /k;
        }
        return (double) maxsum/k;
    }
}