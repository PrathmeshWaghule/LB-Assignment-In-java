/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : print number 1 to your number 

    input : 10

    output : 1 2 3 4 5 6 7 8 9 10

    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/

import java.util.Scanner;

class Display
{
    public int iNum;

    public Display(int A)
    {
        iNum = A;
    }

    public void DiplayNumber()
    {
        int i = 0;

        for(i = 1 ; i <= iNum ; i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}

class Program3
{

    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        Display dObj = new Display(iValue);

        dObj.DiplayNumber();


    }
}