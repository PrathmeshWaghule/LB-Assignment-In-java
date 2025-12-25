

/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Accept number from user and display first number from second number time  

    input : 10  5 

    output : 10  10  10  10  10

    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/


import java.util.Scanner;

class NumberDisplay
{
    public int iNum1;
    public int iNum2;

    public NumberDisplay(int A , int B)
    {
        iNum1 = A;
        iNum2 = B;
    }

    public void Serice()
    {
        int i = 0;

        for(i = 1 ; i <= iNum2 ; i++)
        {
            System.out.print(iNum1+"\t");
        }
        System.out.print("\n");
    }
}
class Program6
{
    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;

        System.out.println("Enter First number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNo1,iNo2);

        nObj.Serice();
    }
}