class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a : s.toCharArray()) {
            if(map.containsKey(a)) {
                int value = map.get(a);
                map.put(a, value+1);
            } else {
                map.put(a, 1);
            }
        }
        for(int b : t.toCharArray()) {
            if(!map.containsKey(b)) return false;
            int value = map.get(b);
            if(value == 0) {
                return false;
            } else { 
                map.put(b, value-1);
            }
        }
        return true;
    }
}
