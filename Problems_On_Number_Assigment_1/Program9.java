
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Accept number from user and dsiplay factor of Multiplication   

    input : 12 

    output : (1 * 2 * 3 * 4 * 6) 144

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

    public int FactorMul()
    {
        int i = 0;
        int iMul = 1;
        for(i = 1 ; i <= iNum/2 ; i++)
        {
            if(iNum % i == 0)
            {
                iMul = iMul * i;
            }
        }

        return iMul;
    }
}
class Program9
{

    public static void main(String arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        iNo = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNo);

        iRet = nObj.FactorMul();

        System.out.println(iNo+" Factor multiplication is : "+iRet);
    
    }
    
}
