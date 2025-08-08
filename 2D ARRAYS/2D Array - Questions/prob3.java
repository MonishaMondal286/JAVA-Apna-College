// Find and print the largest element in a 2D array.
public class prob3 {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }

            }
           
        }
         System.out.print(max);
    }
}
