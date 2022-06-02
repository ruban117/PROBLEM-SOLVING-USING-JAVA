/*Problem Description

The task is to count all the possible paths from top left to bottom right of a
m x n matrix with the constraints that from each cell you can either move only to right or down.

Input:

First line consists of T test cases. First line of every test case consists of N and M,
denoting the number of rows and number of columns respectively.
Output:

Single line output i.e count of all the possible paths from top left to bottom right of a m x n matrix..
Constraints:

1<=T<=100
1<=N<=100
1<=M<=100*/
import java.util.*;
class Maneuvering_A_Cave{
   public static void main(String[]args){
       int t,n,m,i,j,k;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Number Of Test Cases: ");
       t=sc.nextInt();
       for(i=0;i<t;i++){
       System.out.print("How Many Rows?: ");
       n=sc.nextInt();
       System.out.print("How Many Columns?: ");
       m=sc.nextInt();
       int mat[][]=new int[n][m];
           for(j=0;j<n;j++){
               for(k=0;k<m;k++){
                   System.out.print("Enter Row And Column "+j+","+k+": ");
                   mat[j][k]=sc.nextInt();
               }
               System.out.println();
           }
           for(j=0;j<n;j++){
               for(k=0;k<m;k++){
                   System.out.print(mat[j][k]+" ");
               }
               System.out.println();
           }
           System.out.print("All the possible paths from top left to bottom right of the matrix..: ");
           System.out.print(path(m,n));
           System.out.println();
       }
   }
   static int path(int i,int j){
       if(i==1|| j==1){
           return 1;
       }
       else{
           return path(i-1,j)+path(j,i-1);
       }
   }
}