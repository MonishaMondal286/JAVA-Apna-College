import java.util.*;

public class large {
    public static void FindLargeAndSmall(int matrix[][]){
        
        int n = matrix.length, m = matrix[0].length;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                   
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
                 
                   
            }
           
        }
        System.out.println("largest number is "+ largest);
        System.out.println("smallest number is "+ smallest);
       
    }

    public static void main(String args[]){

        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;


        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
        
      FindLargeAndSmall(matrix);

    }
    
}
