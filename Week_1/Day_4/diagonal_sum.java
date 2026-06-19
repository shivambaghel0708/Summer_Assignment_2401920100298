package Week_1.Day_4;

public class diagonal_sum {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int suml=0;
        int sumr=0;
        for(int i=0;i<n;i++){
            suml+=mat[i][i];
            sumr+=mat[i][n-1-i];

        }
        int sum=suml+sumr;
        if(n%2==0){
            return sum;
        }
        else return sum-mat[n/2][n/2];
        
    }
}
    
}
