package Week_1.Day_4;

public class reshape_the_matrix {
    class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        
        if (n*m!=r*c){
            return mat;
        }
        int[][] ans=new int[r][c];
        for(int i=0;i<m*n;i++){
            ans[i/c][i%c]=mat[i/m][i%m];
            }
            return ans;
        
            
        
    }
}
    
}
