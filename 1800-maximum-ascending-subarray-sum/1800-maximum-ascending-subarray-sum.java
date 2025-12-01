class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum  =nums[0];
        int maxsum = nums[0];
        
       for(int i = 1;i<n;i++){
        if(nums[i] >nums[i-1]){
           sum  += nums[i] ;
//continue ascending sum
        }
        else{sum = nums[i];
         //reset sum }
       }
  maxsum  = Math.max(sum , maxsum);
        
       }
        return maxsum;
        
    }
}