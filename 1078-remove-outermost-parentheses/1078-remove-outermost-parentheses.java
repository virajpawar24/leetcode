class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(cnt > 0) result.append(ch);
                cnt++;
            }
            else if(ch == ')'){
                cnt--;
                if(cnt > 0) result.append(ch);
            }

        }
        return result.toString();
    }
}