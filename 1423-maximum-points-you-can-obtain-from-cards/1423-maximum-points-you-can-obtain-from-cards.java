class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lscore = 0;
        int rscore = 0;
        int maxscore =0;
        for(int i = 0;i< k;i++) lscore += cardPoints[i];
           

        
        maxscore = lscore;
        int rindex = cardPoints.length -1;
        for( int i = k-1;i>=0;i--){
            lscore = lscore - cardPoints[i];
            rscore = rscore + cardPoints[rindex];
             rindex = rindex -1;
            maxscore = Math.max(maxscore,lscore+ rscore);
        }
        
        return maxscore;


    }
}