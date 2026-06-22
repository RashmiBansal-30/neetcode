class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            String word = strs[i];
            char[] chars = word.toCharArray();

            Arrays.sort(chars);
            String password = new String(chars);

            if (!map.containsKey(password)){
                map.put(password, new ArrayList<>());
            }

            map.get(password).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
