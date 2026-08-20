class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
class Solution {
    public boolean validPalindrome(String s) {
        

        for(int i=0;i<s.length();i++){
            String check=s.substring(0,i)+s.substring(i+1);
            StringBuilder str=new StringBuilder(check);
            String reversed=str.reverse().toString();
            if(check.equals(reversed))
                return true;
        }
        return false;
    }
}
*/