class Solution {
    public boolean hasMatch(String s, String p) {
        int ind = p.indexOf('*');
        int firstpos = s.indexOf(p.substring(0,ind));
        int secondpos = s.indexOf(p.substring(ind+1),firstpos + ind);
        if(firstpos != -1 && secondpos != -1){
            return true;
        }
        return false;
    }
}