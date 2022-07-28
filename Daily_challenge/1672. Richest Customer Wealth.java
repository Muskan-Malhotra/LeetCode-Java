class Solution4 {
  public int maximumWealth(int[][] accounts) {
      
      
      
      int max = Integer.MIN_VALUE;
      for(int i=0;i<accounts.length;i++){
          int sum = 0;
          // System.out.println(accounts[0].length);
          for(int j=0;j<accounts[0].length;j++){
              sum += accounts[i][j];
          }
          
          if(sum>max){
              max = sum;
          }
      }
      
      return max;
      
  }
}