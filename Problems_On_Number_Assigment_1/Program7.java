
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Accept from user number and print even number   

    input : 7 

    output : 2	4	6	8	10	12	14

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

    public void DisplayEven()
    {
        int i = 2;
        int iCnt = 1;

        while(iCnt <= iNum)
        {
            if(i % 2 == 0)
            {
               System.out.print(i+"\t");
               iCnt++;
               i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println();
    }
}
class Program7
{
    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNo);

        nObj.DisplayEven();
    }
}