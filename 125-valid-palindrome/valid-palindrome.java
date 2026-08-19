class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder str=new StringBuilder(s);
        String reversed=str.reverse().toString();

        return s.equals(reversed);



    }
}