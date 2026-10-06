class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map_s = new HashMap<>(); 
        HashMap<Character, Integer> map_t = new HashMap<>();

        int i = 0;
        while(i < s.length()) {
            map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
            map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i),0) + 1);
            i++;
        }
        return map_s.equals(map_t);
    }
}
