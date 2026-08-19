class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int mid=s.length/2;

        for(int i=0;i<mid;i++){
                char temp=s[i];
                s[i]=s[n-i];
                s[n-i]=temp;
        }
    }
}