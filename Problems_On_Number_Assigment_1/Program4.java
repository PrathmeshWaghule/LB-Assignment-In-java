
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Check number is divisible by 5 or not 

    Case 1: 
            input : 12

            output : 12 is not divisible by 5

    Case 2: 
            input : 10

            output : 10 is divisible by 5


    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/

import java.util.Scanner;

class NumbersProblem
{
    public int iNo;

    public NumbersProblem(int A)
    {
        iNo = A;
    }

    public boolean DivisibleByFive()
    {
        boolean bAns = false;

        if(iNo % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program4
{

    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        NumbersProblem nObj = new NumbersProblem(iValue);

        bRet = nObj.DivisibleByFive();

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5");
        }
        else
        {
            System.out.println(iValue+" is not divisible by 5");   
        }
        

    }
    

}