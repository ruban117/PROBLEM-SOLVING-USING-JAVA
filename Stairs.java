/*Problem Description

There are n stairs, a person standing at the bottom wants to reach the top.
The person can climb either 1 stair or 2 stairs at a time.

Count the number of ways, the person can reach the top.*/
import java.util.*;
class Stairs {
    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("How Many Stairs?: ");
        n=sc.nextInt();
        System.out.print("The Number Of Stairs Are: ");
        System.out.print(n+" ");
        System.out.print("the number of ways, the person can reach the top: ");
        System.out.print(way(n));
    }
    static int way(int b){
        if(b<=1){
            return b;
        }
        else{
            return way(b-1)+way(b-2);
        }
    }
}
