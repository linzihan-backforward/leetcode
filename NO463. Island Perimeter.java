/**
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, 
and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" 
(water inside that isn't connected to the water around the island). 
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
Determine the perimeter of the island.
题意：给一个方格阵，其中1代表陆地，0代表水，陆地都是连在一起的，然后每个小格边长为1，问陆地的周长是多少？
思路：我们这样想：如果所有的陆地都是彼此远离的，那么答案就是陆地数*4，如果有两个挨着那么，接触的边就被多算了两次，
	至此，答案呼之欲出，对于每个陆地答案先+4，如果它左边有陆地那么答案-2，如果它上边有陆地那么答案-2，
	最后O(n*m)即可算出答案。
*/
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j]==1) ans+=4;
                    else continue;
                    if(i>0&&grid[i-1][j]==1) ans-=2;
                    if(j>0&&grid[i][j-1]==1) ans-=2;
                }
        return ans;
    }
}