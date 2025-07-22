import java.util.*;
public class search2{
    public static boolean FindEle(int matrix[][], int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j] == key){
                System.out.println("found in "+ i+"," +j);
                 return true;
               }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
       
        FindEle(matrix,5);

    }




}

