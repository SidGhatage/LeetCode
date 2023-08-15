class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> GroupAnagrams = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!GroupAnagrams.containsKey(sortedWord)){
                GroupAnagrams.put(sortedWord, new ArrayList<>());
            }
            GroupAnagrams.get(sortedWord).add(word);
        }
        return new ArrayList<>(GroupAnagrams.values());
    }
}