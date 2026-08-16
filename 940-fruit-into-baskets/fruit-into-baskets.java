class Solution {
    public int totalFruit(int[] fruits) {
        
        int ans=0,left=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }

        return ans;


    }
}





/*
class Solution {
    public int totalFruit(int[] fruits) {
        
        int ans=0;

        for(int left=0;left<fruits.length;left++){
            HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;

            for(int right=left;right<fruits.length;right++){
                map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
                if(map.size()>2){
                    break;
                }
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;

    }
}

*/