public class que1{
    public static void PrintEle(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
    PrintEle(matrix);
    }
}