
/**
 * 1 <= nums.length <= 20
 */

class TargetSumPosNeg {
  public int findTargetSumWays(int[] nums, int diff) {
      
      
      int sum = 0;
      for(int ele:nums){
          sum += ele;
      }
      
      int s1 = (diff+sum)/2;
      
      //this is because the sum after division is a decimal number which cannot be divided into sunsets of 2
      if((sum+diff)%2 != 0 || s1<0){
          return 0;
      }
      
      return countSubsetSum(nums,s1);
      
  }
  
  public static int countSubsetSum(int[] arr, int sum){
      int n = arr.length;
      int[][]dp = new int[n+1][sum+1];
      
      for(int i=0;i<dp.length;i++){
          for(int j=0;j<dp[0].length;j++){
              
              if(i==0 && j==0){
                  dp[i][j] = 1;
              }
              else if(i==0){
                  dp[i][j] = 0;
              }
              // else if(j==0){  //NOt at all required
              //     dp[i][j] = 1;
              // }
              else{
                  if(arr[i-1]<=j){
                      dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
                  }
                  else{
                      dp[i][j] = dp[i-1][j];
                  }
              }
              
          }
      }
      return dp[n][sum];
      
      
  }
}

// [7,9,3,8,0,2,4,8,3,9]
// 0
// [1]
// 2
// [1,2,1]
// 0
// [100]
// -200


/**
 * Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 */