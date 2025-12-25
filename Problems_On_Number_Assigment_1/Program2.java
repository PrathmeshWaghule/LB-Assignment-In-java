
/*

    Authore : Prathmesh Ashok Waghule

    Problem Statemet : Print message on screen till enter number

    input : 5

    output : Jay Ganesh..!
             Jay Ganesh..!
             Jay Ganesh..!
             Jay Ganesh..!
             Jay Ganesh..!
             
    Date : 9/Oct/2025

*/


import java.util.Scanner;

class Display
{
    public int iSize;

    public Display(int iNum)
    {
        iSize = iNum;
    }

    public void DisplayString()
    {
        int i = 0 ;

        for(i = 0 ; i < iSize ; i++)
        {
            System.out.println("Jay Ganesh...!");
        }
    }
}
class Program2
{
    public static void main(String Arr[])
    {

        Scanner sObj = new Scanner(System.in);
        
        int i = 0;
        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sObj.nextInt();

        Display dObj = new Display(iNo);
        dObj.DisplayString();
    }
}