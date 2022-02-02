class Solution {
    public int numIslands(char[][] grid) {
       int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        
        for(int currentRow = 0;currentRow< m;currentRow++){
            for(int currentCol = 0;currentCol< n;currentCol++){
                if(grid[currentRow][currentCol] == '1')
                    ans += 1;
                    fillGrid(grid,currentRow,currentCol,m,n);
            }
        }
        return ans;
    }
    private void fillGrid(char[][] grid,int currentRow,int currentCol,int m,int n){
        if(currentRow < 0 || currentRow >= m || currentCol < 0 || currentCol >= n || grid[currentRow][currentCol] == '0') return;
        
        grid[currentRow][currentCol] = '0';
        
        //up move
        fillGrid(grid,currentRow-1,currentCol,m,n);
        
        //down move
        fillGrid(grid,currentRow+1,currentCol,m,n);
        
        //right move
        fillGrid(grid,currentRow,currentCol+1,m,n);
        
        //left move
        fillGrid(grid,currentRow,currentCol-1,m,n);
        
        return;
    }
}