//2. **Transpose of Matrix:**
//Given a square matrix, find its transpose.

public class que2 {
   public static void TransposeMatrix(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
   } 

   public static void main(String args[]){
    int row = 3, col = 3;
    int matrix[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
    

    int transpose[][] = new int [col][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transpose[j][i] = matrix[i][j];
        }
        
      }
      TransposeMatrix(transpose);
   }
}
