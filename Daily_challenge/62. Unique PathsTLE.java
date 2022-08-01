class UniquePathsTLE {
    static int count = 0;
    public int uniquePaths(int m, int n) {
        count = 0;
        boolean[][] vis = new boolean[m][n];
        countUniquePaths(0,0,m,n,vis);
        // System.out.println(ans);
        return count;
        
    }
    
    public static void countUniquePaths(int r, int c,int m, int n,boolean[][] vis){
        
        if(r>=m || c>=n || vis[r][c] == true){
            return;
        }
        if(r==m-1 && c==n-1){
            count++;
            return;
        }
        
        vis[r][c] = true;
        countUniquePaths(r+1,c,m,n,vis);
        countUniquePaths(r,c+1,m,n,vis);
        vis[r][c] = false;
        return;
    }
}