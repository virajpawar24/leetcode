class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        // Sliding window
        for (int i = k; i < s.length(); i++) {
            // Add next character
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }

            // Remove previous character
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }

            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';
    }
    
}