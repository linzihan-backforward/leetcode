/**
 * n MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
题意：将给出的一个a*b的矩阵转为r*c的矩阵，如果可以转化的话就返回转化后的，否则返回原来的。
思路：如果a*b！=r*c则显然不能转化，然后将新的矩阵与原矩阵一一对应就行了，没什么难度。 
*/
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int oldRow=nums.length;
        int oldColumn=nums[0].length;
        if(r*c!=oldRow*oldColumn) return nums;
        int [][] ans=new int [r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                int cnt=i*c+j;
                ans[i][j]=nums[cnt/oldColumn][cnt%oldColumn];
            }
        return ans;    
    }
}