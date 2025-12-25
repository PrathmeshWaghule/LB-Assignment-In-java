/*

    Display non factors

*/

import java.util.Scanner;

class NumberDisplay
{
    public int iNo;

    public NumberDisplay(int iValue)
    {
        this.iNo = iValue;
    }

    public void NonFactors()
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

        System.out.print("\n");
    }

}
class Program1
{

    public static void main(String Arr[])
    {

        Scanner sObj = new Scanner(System.in);
        int iNum = 0;

        System.out.println("Enter number : ");
        iNum = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNum);

        nObj.NonFactors();
        
    }
}   