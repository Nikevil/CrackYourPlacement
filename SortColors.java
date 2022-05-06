class Solution {
    
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int i=0;
        int k=0;
        int j=nums.length-1;
        
        while(i<=j){
            if(nums[i] == 2){
                swap(nums , i , j);
                j--;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                swap(nums , i , k);
                i++;
                k++;
            }
        }
    }
}
