
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : check number is Even or Odd or not 

    Case 1: 
            input : 12

            output : Nuber is Even

    Case 2: 
            input : 3

            output : Number is Odd


    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/

import java.util.Scanner;

class NumbersProblem
{
    public int iNum;

    public NumbersProblem(int A)
    {
        iNum = A;
    }

    public boolean ChkEvenOdd()
    {
        if(iNum % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program5
{
    public static void main(String Arr[])
    {   
        Scanner sObj = new Scanner(System.in);
    
        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number to chake it is Even or Odd : ");
        iNo = sObj.nextInt();

        NumbersProblem nObj = new NumbersProblem(iNo);

        bRet = nObj.ChkEvenOdd();

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }


    }
    
}