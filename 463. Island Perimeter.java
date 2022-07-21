class Perimeter{
  static int mx = 0;
  public int islandPerimeter(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      
      boolean[][] vis = new boolean[m][n];
      // int max = 0;
      mx = 0;
      //just refresh the static variable here!!
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              
              if(grid[i][j] == 1 && vis[i][j] == false){
                  
                  dfs(grid, i,j,vis);
                  
              }
          }
      }
      
      return mx;
      
      
  }
  
  
  public static int dfs(int[][] grid, int i, int j,boolean[][] vis){
      
      int m = 1;
      
      if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0){
          return 0;
      }
      if(vis[i][j] == true){
          return 1;
      }
      
      vis[i][j] = true;
      
      // System.out.print(m);
      // int u,l,r,d = 0;
      
      int u= dfs(grid, i-1,j,vis);
      int r= dfs(grid, i,j+1,vis);
      int d= dfs(grid, i+1,j,vis);
      int l= dfs(grid, i,j-1,vis);
      
      // System.out.println("u"+u+"r"+r+"d"+d+"l"+l);
      mx += 4-(u+l+d+r);
      
      
      
      
      return m;
      
      
  }
}