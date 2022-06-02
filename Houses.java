/*Problem Description

Question:- There are n houses build in a line, each of which contains some value in it.

 A thief is going to steal the maximal value of these houses,
 but he can’t steal in two adjacent houses because the owner of the stolen houses
 will tell his two neighbours left and right side.

What is the maximum stolen value?

Sample Input: val[] = {6, 7, 1, 3, 8, 2, 5}

Sample Output: 20*/

import java.util.*;
class Houses {
        public static void main(String[]args){
                int n;
                Scanner sc=new Scanner(System.in);
            System.out.print("How Many Houses?: ");
            n=sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<n;i++){
                    System.out.print("Enter The Value Of House "+i+":");
                    A[i]=sc.nextInt();
            }
            System.out.println("The Values Are");
                for(int i=0;i<n;i++) {
                        System.out.print(A[i]+" ");
                }
                System.out.print("\nThe Maximum Stolen Value Is: ");
                System.out.print(stolen(A,n));
        }
        static int stolen(int B[],int j){
                if(j==0)
                        return 0;
                if(j==1)
                        return B[0];
                if(j==2)
                        return Math.max(B[0],B[1]);
                int[] dp=new int[j];
                dp[0]=B[0];
                dp[1]=Math.max(B[0],B[1]);
                for(int i=2;i<j;i++){
                      dp[i]= Math.max(B[i]+dp[i-2],dp[i-1]);
                }
                return dp[j-1];
        }
}
