class Solution {
    
      
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        // Store characters of the string in a set for quick lookup
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if one of uppercase/lowercase pair is missing
            if (set.contains(Character.toLowerCase(ch)) &&
                set.contains(Character.toUpperCase(ch))) {
                continue;
            }

            // split string into two parts and recurse
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            // return longer substring
            return left.length() >= right.length() ? left : right;
        }

        // If loop completes, all characters have both cases
        return s;
    }
}

    
