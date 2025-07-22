import java.util.*;

public class search{
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        // the above line can also be written as 
        //int n = matrix.length, m = matrix[0].length;

        //taking input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}