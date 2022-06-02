/*Q2)Problem Description

Question – : There are two banks – Bank A and Bank B.
Their interest rates vary. You have received offers from both banks in terms of the
annual rate of interest, tenure,
and variations of the rate of interest over the entire tenure.
You have to choose the offer which costs you least interest and reject the other.
Do the computation and make a wise choice.

The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI) is calculated using the formula given below :

EMI = loanAmount * monthlyInterestRate / ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))
Constraints:

1 <= P <= 1000000
1 <=T <= 50
1<= N1 <= 30
1<= N2 <= 30

Input Format:

First line: P principal (Loan Amount)
Second line: T Total Tenure (in years).
Third Line: N1 is the number of slabs of interest rates for a given period by Bank A.
 First slab starts from the first year and the second slab starts from the end of the first slab and so on.
Next N1 line will contain the interest rate and their period.
After N1 lines we will receive N2 viz. the number of slabs offered by the second bank.
Next N2 lines are the number of slabs of interest rates for a given period by Bank B.
 The first slab starts from the first year and the second slab starts from the end of the first slab and so on.
The period and rate will be delimited by single white space.

Output Format: Your decision either Bank A or Bank B.

Explanation:

Example 1
Input
10000
20
3
5 9.5
10 9.6
5 8.5
3
10 6.9
5 8.5
5 7.9
Output: Bank B
Example 2
Input
500000
26
3
13  9.5
3  6.9
10  5.6
3
14  8.5
6  7.4
6  9.6
Output: Bank A*/
import java.util.*;
class Bank_Loan
{
    public static void main(String args[]) {
        int y,n,yrs,k,l=0,i;
        double p,emi,sum,s,sq;
        double[]bank=new double[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Loan Amount: ");
        p=sc.nextDouble();
        System.out.print("How Many Years?: ");
        y=sc.nextInt();
        for(k=0;k<2;k++)
        {
            System.out.print("Enter The Number Of Slabs For Bank: ");
            n=sc.nextInt();
            sum=0;
            for(i=0;i<n;i++)
            {
                System.out.print("Enter Years And Monthly Interest Rate For Bank : ");
                yrs=sc.nextInt();
                s=sc.nextDouble();
                sq=Math.pow((1+s),yrs*12);
                emi=(p*(s)/(1-1/sq));
                sum+=emi;
            }
            bank[l++]=sum;
        }
        System.out.print("The Best Bank For Loan Is: ");
        if(bank[0]<bank[1])
        {
            System.out.print("Bank A");
        }
        else
        {
            System.out.print("Bank B");
        }
    }
    }
