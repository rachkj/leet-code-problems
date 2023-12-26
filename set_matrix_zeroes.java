class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[] rowArray=new int[m];
        int[] colArray=new int[n];

        Arrays.fill(rowArray,1);
        Arrays.fill(colArray,1);

        for(int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                if (matrix[i][j]==0){
                    rowArray[i]=0;
                    colArray[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                if(rowArray[i]==0 || colArray[j]==0){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
