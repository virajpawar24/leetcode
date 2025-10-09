class Solution {
    public String largestOddNumber(String num) {
        int ind = -1;
        int i;
        for(i = num.length()-1;i>=0;i--){
            //odd value 
            if((num.charAt(i) - '0')%2 == 1){
                ind =i;
                break;
            }
        }
          if(ind ==  -1){
            return "";
          }
            // Skip leading zeroes up to the odd digit
         i = 0;
        while (i <= ind && num.charAt(i) == '0') i++;
           // Return substring from first non-zero to odd digit
        return num.substring(i, ind + 1);
    }
}