class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      
      //connected components
      
      boolean[][] vis = new boolean[image.length][image[0].length];
      int val = image[sr][sc];
      dfs(image,sr,sc,color,vis,val);
      
      return image;
          
      }
  
  
  public static void dfs(int[][] image, int sr, int sc, int color,boolean[][] vis,int ir){
      
      if(sr<0 || sc<0 ||sr>=image.length || sc>= image[0].length || image[sr][sc] != ir || vis[sr][sc] == true){
          return;
      }
      
      vis[sr][sc] = true;
      
      image[sr][sc] = color;
      
      // for(int i=0;i<image.length;i++){
      //     for(int j=0j<image[0].length;j++){
      //         if(vis[i][j] == false){
      //             dfs(image,i,j,color,vis);
      //         }
      //     }
      // }
      dfs(image,sr-1,sc,color,vis,ir);
      dfs(image,sr,sc+1,color,vis,ir);
      dfs(image,sr+1,sc,color,vis,ir);
      dfs(image,sr,sc-1,color,vis,ir);
      return;
  
}

}

// [[0,0,0],[0,0,0]]
// 1
// 0
// 2
// [[1,1,1],[1,1,0],[1,0,1]]
// 1
// 1
// 2
// [[0,0,0],[0,0,0]]
// 0
// 0
// 0