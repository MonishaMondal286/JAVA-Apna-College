//Given a 2D matrix and a target value, search for the value and return its position (row, col). If not found, return -1.
public class gpt2 {
    public static int main(String args[]){
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int target = 5;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("element found at"+i+","+j);
                }
                else{
                    return -1;
                }
                 
            }
           
        }
        
         
        
    }
}
