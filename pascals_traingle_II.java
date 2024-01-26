class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows=rowIndex+1;
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for(int i=1;i<numRows;i++){
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for(int j=1;j<i;j++){
                row.add(prev_row.get(j-1)+ prev_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}