class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
       HashMap<Integer , Integer> map = new HashMap<>();
        
        int ans = 0;
        
        int sum = 0;
        
        int rem = 0;
        
        map.put(0 , 1);
        
        for(int i=0; i<nums.length; i++){
            
            sum+=nums[i];
            
            rem = sum%k;
            
            if(rem < 0){
                rem+=k;
            }
            
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                ans += freq;
                
                map.put(rem , freq+1);
                
            }
            else{
                map.put(rem , 1);
            }
        }
        
        return ans;
        
    }
}
