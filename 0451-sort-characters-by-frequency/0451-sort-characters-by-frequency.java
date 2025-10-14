class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch , hm.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(hm.keySet());
        // Step 3: Sort by frequency (descending), then alphabetically if equal
        list.sort((a,b) -> {
         int freqcompare = hm.get(b) - hm.get(a);
         if(freqcompare == 0){
            return a - b;
         }
         return freqcompare;
        });
        // Step 4: Build result string
        for(char ch :list){
            for(int i =0;i<hm.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}