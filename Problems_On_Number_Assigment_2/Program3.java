

/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Display factores in Decreasing order 

    input : 12

    output : 6  4   3   2   1

    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/

/*
Summation of all factors and non factors
*/

import java.util.Scanner;

class NumberDisplay
{
    public int iNo ;


    public NumberDisplay(int iValue)
    {
        this.iNo = iValue;
    }

    public int DiffeOfFactorsAndNonFactors()
    {
        int iCnt = 0 , iSum1 = 0 , iSum2 = 0 , iAns = 0;

        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }

        iAns = iSum1 - iSum2;

        return iAns;
    }

}
class Program3
{

    public static void main(String Arr[])
    {

        Scanner sObj = new Scanner(System.in);
        int iNum = 0 , iRet = 0;

        System.out.println("Enter number : ");
        iNum = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNum);

        iRet = nObj.DiffeOfFactorsAndNonFactors();
        
        System.out.println("Diffrence between of All factors and Non factors are : "+iRet);
    }
}   

