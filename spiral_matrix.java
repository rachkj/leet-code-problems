class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startingRow=0;
        int startingCol=0;
        int m = matrix.length;
        int n = matrix[0].length;
        int endingRow=m-1;
        int endingCol=n-1;
        int count=0;
        int total=m*n;
        List<Integer> result = new ArrayList<>();

        while(count<total){

            for(int i=startingCol;count<total && i<=endingCol;i++){
                result.add(matrix[startingRow][i]);
                count++;
            }
            startingRow++;

            for(int i=startingRow;count<total && i<=endingRow;i++){
                result.add(matrix[i][endingCol]);
                count++;
            }
            endingCol--;

            for(int i=endingCol;count<total && i>=startingCol;i--){
                result.add(matrix[endingRow][i]);
                count++;
            }
            endingRow--;

            for(int i=endingRow;count<total && i>=startingRow;i--){
                result.add(matrix[i][startingCol]);
                count++;
            }
            startingCol++;
        }
    return result;
    }
}
