class Solution {
    
    
    static void newArray(int[][] arr , int row , int col){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(row == i || col == j){
                    arr[i][j] = 0;
                }
            }
        }
    }
    
    
    
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        
        for(int i=0; i<list.size()-1; i=i+2){
            newArray(matrix , list.get(i) , list.get(i+1));
        }
    }
}
