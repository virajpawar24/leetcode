class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>();
       int max = 0;
       for(int c :candies ){
        max = Math.max(c, max);

       }

       for(int candycount :candies ){
        result.add(candycount + extraCandies >= max);
       }
       return result;
    }
}