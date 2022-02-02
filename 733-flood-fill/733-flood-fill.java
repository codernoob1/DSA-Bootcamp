class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int newColor) {
        if(grid[sr][sc] == newColor)
            return grid;
        
        fillGraph(grid,sr,sc,grid[sr][sc],grid.length,grid[0].length,newColor);
        return grid;
    }
    private void fillGraph(int[][] grid,int currentRow,int currentCol,int color,int m,int n,int newColor){
        if(currentRow < 0 || currentRow >= m || currentCol <0|| currentCol >= n || grid[currentRow][currentCol] != color) return;
        
        grid[currentRow][currentCol] = newColor;
        
        //up move
        fillGraph(grid,currentRow-1,currentCol, color, m, n, newColor);
        
        //down move
        fillGraph(grid,currentRow+1,currentCol, color, m, n, newColor);
        
        //right move
        fillGraph(grid,currentRow,currentCol+1, color, m, n, newColor);
        
        //left move
        fillGraph(grid,currentRow,currentCol-1, color, m, n, newColor);
        
        return;
    }
}