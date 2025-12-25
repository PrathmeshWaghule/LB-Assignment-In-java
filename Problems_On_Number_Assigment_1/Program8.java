
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Accept number from user and Diplay even Factors   

    input : 24  

    output :  2 , 3 , 4 , 6 , 8 , 12

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

    public void EvenFactor()
    {
        int i = 0;

        for(i = 1 ; i <= iNum/2 ; i++)
        {
            if(iNum % i == 0)
            {
                if(i % 2 == 0)
                {
                    System.out.print(i+"\t");
                }
            }
        }
        System.out.println();
    }
}

class Program8
{

    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNo);

        nObj.EvenFactor();

    }
}