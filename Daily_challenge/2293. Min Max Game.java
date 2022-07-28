class Solution7 {
    public int minMaxGame(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
             
        }
        
        int[] ansnums = new int[nums.length/2];
        int count = 0;
        int j = 0;
        
        for(int i=0;i<nums.length;i+=2){
            
            if(count%2 == 0){
                
                int ans = Math.min(nums[i],nums[i+1]);
                ansnums[j] = ans;
                j++;
                count++;
                
            }
            else if(count%2 != 0){
                int ans = Math.max(nums[i],nums[i+1]);
                ansnums[j] = ans;
                j++;
                count++;
                
            }
        }
        
        int ret = minMaxGame(ansnums);
        
        return ret;
        
    }
}