/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Display factores in Decreasing order 

    input : 12

    output : 6  4   3   2   1

    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/


import java.util.Scanner;

class NumberDisplay
{
    public int iNum;

    public NumberDisplay(int iValue)
    {
        iNum = iValue;
    } 

    public void FactorRevers()
    {
        int i = 0;

        for(i = iNum/2 ; i >= 1 ; i--)
        {
            if(iNum % i ==  0)
            {
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}
class Program10
{

    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNo);
        nObj.FactorRevers();
    }
}