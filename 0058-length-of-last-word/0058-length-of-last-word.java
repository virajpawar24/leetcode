class Solution {
    public int lengthOfLastWord(String s) {
        String [] sen = s.trim().split("\\s+");
        return sen[sen.length - 1].length();

    }
}