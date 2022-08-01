class UniquePathMem {
    
  public int uniquePaths(int m, int n) {
      
      int[][] dp = new int[m+1][n+1];
      for(int i=0;i<dp.length;i++){
          for(int j=0;j<dp[0].length;j++){
              dp[i][j] = -1;
          }
      }
      int ans = countUniquePaths(0,0,m,n,dp);
      System.out.println(ans);
      return ans;
      
  }
  
  public static int countUniquePaths(int r, int c,int m, int n,int[][] dp){
      
      if(r>=m || c>=n){
          return 0;
      }
      if(r==m-1 && c==n-1){
          
          return 1; 
      }
      
      if(dp[r][c] != -1){
          return dp[r][c];
      }
      
      return dp[r][c] = countUniquePaths(r+1,c,m,n,dp) + countUniquePaths(r,c+1,m,n,dp);
  }
}

// 23
// 12