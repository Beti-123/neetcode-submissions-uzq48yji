class Solution {
    public String longestCommonPrefix(String[] strs) {

        // finding shortest string
        String shortest = strs[0];
        for(String str : strs) {
            if(str.length() < shortest.length()) {
                shortest = str;
            }
        }

        String output = "";
        int i = 0;
        boolean end = false;

        // up to 200, as that is the constraint
        outerloop:
        while(end == false && i < shortest.length()) {
            boolean isChar = true;
            char fst = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != fst) {
                    isChar = false;
                    break outerloop;
                }
            }
            output += fst;
            i++;
        }
        return output;
    }
}