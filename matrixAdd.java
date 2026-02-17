import java.util.*;
class matrixAdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows of matrices");
        int rows=sc.nextInt();
        System.out.println("enter the columns of matrices");
        int col=sc.nextInt();
        int arr1[][]=new int[rows][col];
        int arr2[][]=new int[rows][col];
        System.out.println("enter the elemnt of array1");
           for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
         System.out.println("enter the elemnt of array2 "); 
         for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }       

        int arr[][]=new int [rows][col];
        System.out.println("after addition");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr[i][j]+" "
                );
            }
            System.out.println(" ");
        }
    }
}