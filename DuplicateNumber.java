class Solution {
    
    public int findDuplicate(int[] nums) {
        
       int i = 0;
        
        int ans =0;
        
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        
       
        
        
        
        for(int j=0; j<nums.length; j++){
            if((nums[j]-1)!=j){
                ans = nums[j];
                break;
            }
        }
        
        
        return ans;
        
    }
}
