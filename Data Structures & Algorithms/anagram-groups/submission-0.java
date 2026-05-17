class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hmap = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(int i=0; i<s.length(); i++){
                count[s.charAt(i)-'a']++;
            }

            String key = Arrays.toString(count);
            if(!hmap.containsKey(key)){
                hmap.put(key,new ArrayList<>());
            }
            hmap.get(key).add(s);
        }

        return new ArrayList<>(hmap.values());
    }
}
