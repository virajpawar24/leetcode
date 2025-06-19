class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l = 0; int r = s.length() - 1;
        while(l<r){
           if(s.charAt(l)!=s.charAt(r)){
            return false;
           }
           l++;
           r--;
        }
        return true;

    }
      public static void main(String[] args){
        Solution sol = new Solution();
        String s = "AmanaplanacanalPanama";
        System.out.println(sol.isPalindrome(s));
        System.out.println(sol.isPalindrome("race a car"));
        // System.out.println("A man, a plan, a canal: Panama");
    }
}