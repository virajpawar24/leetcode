class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
            int n = nums.size();
        if (n < 2 * k) return false; // not enough length for two adjacent subarrays

        // Check all possible starting indices
        for (int i = 0; i + 2 * k <= n; i++) {
            if (isIncreasing(nums, i, k) && isIncreasing(nums, i + k, k)) {
                return true;
            }
        }
        return false;
    }

    // Helper to check if subarray of length k starting at index 'start' is strictly increasing
    private boolean isIncreasing(List<Integer> nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) return false;
        }
        return true;
    
    }
    }
