/*
Summation of all non factors
*/



import java.util.Scanner;

class NumberDisplay
{
    public int iNo ;


    public NumberDisplay(int iValue)
    {
        this.iNo = iValue;
    }

    public int SumOfNonFactors()
    {
        int iCnt = 0 , iAns = 0;

        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iAns = iAns + iCnt;
            }
        }

        return iAns;
    }

}
class Program2
{

    public static void main(String Arr[])
    {

        Scanner sObj = new Scanner(System.in);
        int iNum = 0 , iRet = 0;

        System.out.println("Enter number : ");
        iNum = sObj.nextInt();

        NumberDisplay nObj = new NumberDisplay(iNum);

        iRet = nObj.SumOfNonFactors();
        
        System.out.println("Summation of All Non factors are : "+iRet);
    }
}   

