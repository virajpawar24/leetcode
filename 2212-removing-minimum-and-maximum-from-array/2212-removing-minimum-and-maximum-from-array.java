class Solution {
    public int minimumDeletions(int[] nums) {
        int minindex = 0;
        int maxindex = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] >nums[maxindex]){
              maxindex = i;
            }
            if(nums[i]<nums[minindex]){
                minindex  = i;
            }
        }
        //calculate deletion from differnt sides
        int Deletionfromfront = Math.max(maxindex,minindex)+1;
        int Deletionfromback = n - Math.min(maxindex,minindex);
        int Deletionfromfrontandback =( Math.min(maxindex,minindex)+1) + (n- Math.max(maxindex,   minindex));

     return Math.min(Deletionfromfrontandback,Math.min( Deletionfromfront ,Deletionfromback));
    }
}