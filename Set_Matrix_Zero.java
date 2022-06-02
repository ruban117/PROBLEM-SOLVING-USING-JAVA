/*Problem Statement:
Given a matrix if an element in the matrix is 0
then you will have to set its entire column and row to 0 and then return the matrix.

Examples:

Examples 1:

Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:Since matrix[0][0]=0 and matrix[0][3]=0.
Therefore 1st row, 1st column and 4th column will be set to 0
 */
import java.util.*;
class Set_Matrix_Zero {
    public static void main(String[]args){
        int mat[][]=new int[100][100];
        int i,j,row,column;
        Scanner sc=new Scanner(System.in);
        System.out.print("How Many Rows?: ");
        row=sc.nextInt();
        System.out.print("How Many Columns?: ");
        column=sc.nextInt();
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print("Enter"+" "+i+","+j +":");
                mat[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("\nThe Matrix Is Bellow:: \n");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\nFinal Matrix Is Bellow:: \n");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                set_zero(mat);
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void set_zero(int [][] matrix){
        int rows=matrix.length, cols=matrix[0].length;
        int dummy1[]=new int[rows];
        int dummy2[]=new int[cols];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    dummy1[i]=0;
                    dummy1[j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for (int j=0; j<cols;j++){
                if(dummy1[i]==0 || dummy2[j]==0){
                    matrix[i][j]=0;
                }
                //System.out.print(matrix[i][j]+" ");
            }
            //System.out.println();
        }
    }
}
