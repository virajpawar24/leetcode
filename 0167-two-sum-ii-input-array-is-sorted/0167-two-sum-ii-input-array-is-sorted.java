class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(numbers[i] + numbers[j] == target){
                    ans[0] = i+1 ;
                    ans[1] = j +1;
                    return ans; 
                }
            }
        }
        return ans;
    }
}