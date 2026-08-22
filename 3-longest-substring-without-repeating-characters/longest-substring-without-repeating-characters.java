class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(left,map.get(ch)+1); //direct point till after the rep char .a b c .a f h r
            }
            map.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}


/*
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
*/