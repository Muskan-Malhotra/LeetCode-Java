class Solution2 {
  public int[] runningSum(int[] nums) {
      
      int[] ar = new int[nums.length];
      ar[0] = nums[0];
      int ans = ar[0];
      
      for(int i=1;i<=nums.length-1;i++){
          ans += nums[i];
          ar[i] = ans;
      }
      
      return ar;
  }
}