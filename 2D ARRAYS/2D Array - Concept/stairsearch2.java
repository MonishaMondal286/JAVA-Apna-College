public class stairsearch2 {
    public static boolean SortedSearch(int matrix[][], int key){
        int row = matrix.length-1, col = 0;
        while(row>=0 && col<matrix.length){
            if(matrix[row][col] == key){
                System.out.println("key found at ( " + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("not found");
        return true;

    }

    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,39,37,48},
                          {32,33,39,50}};
        int key = 20;
        SortedSearch(matrix, key);
    }
}
