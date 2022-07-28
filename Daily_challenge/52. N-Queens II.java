class Solution3 {
    public int totalNQueens(int n) {
        
        int[][] mat = new int[n][n];
        
        int ans = distinctPlaces(mat,0,0);
        // System.out.println(ans);
        return ans;
        
    }
    
    public static int distinctPlaces(int[][] chess, int row, int count){
        
        if(row == chess.length){
            count++;
            return count;
        }
        
        //for traversing each colmn
        for(int col=0;col<chess.length;col++){
            if(isQueenSafe(chess,row,col) == true){
                chess[row][col] = 1;
                count = distinctPlaces(chess,row+1,count);
                //count = distinctPlaces(chess,row+1,count+1); //this will provide 3 as the count value i.e number of times a function is called and the queen is successfully placed
                chess[row][col] = 0;
            }
        }
        
        return count;
    }
    
    public static boolean isQueenSafe(int[][] chess, int row, int col){
        
        
        //to check on the head of the queen if there is any other queeen
        for(int i=row-1;i>=0;i--){
            if(chess[i][col] == 1){
                //i.e the queen is already a queen places
                return false;
            }
        }
        
        //check for the top-right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        //checking for the top-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>= 0;i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        return true;
    }
}