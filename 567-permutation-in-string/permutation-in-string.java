/*
// for better space complex
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0,count=s1.length();

        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);

            int val=map.getOrDefault(ch,0);
            if(val>0) count--;
            map.put(ch,val-1);

            if(count==0) return true;

            if(right-left+1 == s1.length()){
                char leftChar=s2.charAt(left);
                int leftVal=map.get(leftChar);
                if(leftVal>=0) count++;
                map.put(leftChar,leftVal+1);
                left++;
            }

        }
        return false;
    }
}
*/


// better time complex
class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        int left=0;

        for(int right=0;right<s2.length();right++){
            freq2[s2.charAt(right)-'a']++;
            if(right-left+1>s1.length()){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1 == s1.length()){
                boolean isMatch=true;
                for(int i=0;i<26;i++){
                    if(freq1[i]!=freq2[i])
                        isMatch=false;
                }
                if(isMatch) return true;
            }
        }
        return false;
    }
}


/*

class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sub=s2.substring(i,i+s1.length());
            HashMap<Character,Integer> finalMap=new HashMap<>();
            for(char c:sub.toCharArray()){
                    finalMap.put(c,finalMap.getOrDefault(c,0)+1);
            }
            if(map.equals(finalMap))
                return true;
        }
        return false;
    }
}
*/