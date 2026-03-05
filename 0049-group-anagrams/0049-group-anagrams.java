import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){

            // convert word to char array
            char[] arr = word.toCharArray();

            // sort characters
            Arrays.sort(arr);

            // convert sorted array back to string
            String key = new String(arr);

            // add word to hashmap
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        // return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}