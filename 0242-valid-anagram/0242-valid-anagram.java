class Solution {
    public String SortString(String str){
        char c[]  = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
       s = SortString(s);
       t = SortString(t);

       for(int i =0;i<s.length();i++){
        if(s.charAt(i)!=t.charAt(i)){
            return false;
        }
         
       }
      return true;
    }
}