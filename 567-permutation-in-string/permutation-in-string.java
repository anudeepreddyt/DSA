class Solution {
    public boolean checkInclusion(String s1, String s2) {
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