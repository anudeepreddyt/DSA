//better space complex with one hashmap
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int left=0;
        int count=t.length();
        String ans="";
        int minLen=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch,map.get(ch)-1);
            }
            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char leftChar=s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0) count++;
                }
                left++;
            }
        }
        return ans;
    }
}

/*
// for better time complex
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap=new HashMap<>();
        for(char ch: t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        int left=0;
        String ans="";
        int count=t.length();
        HashMap<Character,Integer> sMap=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);

            if(tMap.containsKey(ch) && sMap.get(ch) <= tMap.get(ch)){
                count--;
            }

            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char leftChar=s.charAt(left);
                sMap.put(leftChar,sMap.get(leftChar)-1);
                if(tMap.containsKey(leftChar) && sMap.get(leftChar)< tMap.get(leftChar)){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}
*/

/*
class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character,Integer> tMap=new HashMap<>();
        for(char ch:t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> sMap=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                sMap.put(ch,sMap.getOrDefault(ch,0)+1);
                if(isValid(sMap,tMap)){
                    String sub=s.substring(i,j+1);

                    if(ans.equals("") || sub.length()<ans.length()){
                        ans=sub;
                    }
                }
            }
    }
    return ans;
    }
    public boolean isValid(HashMap<Character,Integer> sMap,
    HashMap<Character,Integer> tMap){
        for(char ch:tMap.keySet()){
            if(sMap.getOrDefault(ch,0)<tMap.get(ch)){
                return false;
            }
        }
        return true;
    }
}
*/