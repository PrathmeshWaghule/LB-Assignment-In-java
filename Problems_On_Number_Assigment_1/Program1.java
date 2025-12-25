
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Addition of two Numbers 

    input : Enter number First : 10
            Enter number Second : 11

    output : Addition is : 21

    Authore : Prathmesh Ashok Waghule

    Date : 9/Oct/2025

*/
/*

    

*/


import java.util.Scanner;

class Arithmatic
{
    public int iNum1 , iNum2; 
    
    public Arithmatic(int A , int B)
    {
        iNum1 = A;
        iNum2 = B;
    }

    public int Addition()
    {
        int iAns = 0;

        iAns = iNum1 + iNum2;
        return iAns;
    }

}

class Program1
{
    public static void main(String Arr[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;


        System.out.println("Enter First number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sObj.nextInt();

        Arithmatic aObj = new Arithmatic(iNo1,iNo2);

        iAns = aObj.Addition();

        System.out.println("Addition is : "+iAns);

    }
}