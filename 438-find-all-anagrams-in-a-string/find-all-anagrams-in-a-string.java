class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] check=new int[26];

        for(char c:p.toCharArray()){
            check[c-'a']++;
        }

        for(int i=0;i<=s.length()-p.length();i++){
            int[] finalAns=new int[26];

            for(int j=i;j<=i+p.length()-1;j++){
                finalAns[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(check,finalAns)){
                res.add(i);
            }
        }
        return res;
    }
}