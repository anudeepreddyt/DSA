import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();

            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);

                if(set.contains(c)){
                    break;
                }

                set.add(c);
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}