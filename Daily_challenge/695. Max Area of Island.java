class MaxAreaIslands {
  public int maxAreaOfIsland(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      
      boolean[][] vis = new boolean[m][n];
      int max = 0;
      
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              
              if(grid[i][j] == 1 && vis[i][j] == false){
                  // int mx = 0;
                  int ans = dfs(grid, i,j,vis);
                  System.out.println("ans"+ans);
                  if(ans>max){
                      max = ans;
                  }
              }
          }
      }
      
      return max;
      
      
  }
  
  
  public static int dfs(int[][] grid, int i, int j,boolean[][] vis){
      
      int count  = 0;
      if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0 || vis[i][j] == true){
          return 0;
      }
      
      vis[i][j] = true;
      
      // System.out.print(m);
      
      count+= dfs(grid, i-1,j,vis);
      count+= dfs(grid, i,j+1,vis);
      count+= dfs(grid, i+1,j,vis);
      count+= dfs(grid, i,j-1,vis);
      
      
      return count+1;
      
      
  }
}