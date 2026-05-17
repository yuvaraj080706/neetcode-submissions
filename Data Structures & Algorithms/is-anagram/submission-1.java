class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        int s_size = s.length();
        int t_size = t.length();
        if (s_size != t_size){
            return false;
        }
        for(char c : s.toCharArray()){
            alpha[c-'a']++;
        }

        for(char c : t.toCharArray()){
            alpha[c-'a']--;
        }


        for(int i=0; i<26; i++){
            if(alpha[i]!=0){
                return false;
            }
        }

        return true;
    }
}
