class Solution {
  public int[][] transpose(int[][] matrix) {
      
      // int[][] temp = new int[matrix.length][matrix[0].length];
      // int[][] orgmat = matrix;
      
      int n = matrix.length;
      int m = matrix[0].length;
       System.out.println(n+" "+m);
      
      
      
    if(m!=n){
        int ans = n;
        n = m;
        m = ans;
        
    }
  int[][] temp = new int[n][m];
  System.out.println(n+" "+m);
    
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
          temp[j][i] = matrix[i][j];

      }
      // temp = orgmat;
  }

      
      return temp;
      
  }
}