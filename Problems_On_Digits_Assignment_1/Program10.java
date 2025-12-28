/*                                                        
    Function_Name :   differenceOfSumEvenAndOdd()                      
                                                            
    Description :  Accept number from user and return
                   difference between even number and odd number 
                                                            
    case 1:                                                       

        InPut : 23347                                                                                        
        output : (2 - 5) -3


    case 2:                                                       
    
        InPut : 1454                                                                                            
        output : (2 - 2) 0
                                              
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 19-Dec-2025                                      
*/

import java.util.Scanner;

class ProblemsOnDigits
{
    public int iNo;

    public ProblemsOnDigits(int A)
    {
        this.iNo = A; 
    }

    public int differenceOfSumEvenAndOdd() 
    {
        int iTemp = 0;
        int iEvenCnt = 0;
        int iOddCnt = 0;

        while(this.iNo != 0)
        {
            iTemp = this.iNo % 10;
            if((iTemp % 2) == 0)
            {
                iEvenCnt = iEvenCnt + iTemp;
            }
            else
            {
                iOddCnt = iOddCnt + iTemp;
            }
            this.iNo = this.iNo / 10;
        }

        return (iEvenCnt - iOddCnt);
    }
     
}

class Program10
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();


        ProblemsOnDigits pobj = new ProblemsOnDigits(iValue);
        iRet = pobj.differenceOfSumEvenAndOdd();
        
        System.out.println("difference between sum of even number and odd number in " + iValue + " is : " + iRet);


        sobj = null;
        pobj = null;

        System.gc();
    }
}