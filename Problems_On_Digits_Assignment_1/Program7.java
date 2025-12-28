/*                                                        
    Function_Name :   countFrequency()                      
                                                            
    Description :  Accept number from user and count the
                   return the count of digits in between 3 and 7 
                                                            
    case 1:                                                       

        InPut : 23379                                                                                        
        output : 4

    case 2:                                                       
    
        InPut : 145499                                                                                             
        output : 4
                                                             
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

    public int countFrequency() 
    {
        int iTemp = 0;
        int iCnt = 0;

        while(this.iNo != 0)
        {
            iTemp = this.iNo % 10;
            if((iTemp > 3) && (iTemp < 7))
            {
                iCnt++;
            }
            this.iNo = this.iNo / 10;
        }

        return iCnt;
    }
     
}

class Program7
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();


        ProblemsOnDigits pobj = new ProblemsOnDigits(iValue);
        iRet = pobj.countFrequency();
        
        System.out.println("number in between 3 and 7  " + " is : " + iRet);


        sobj = null;
        pobj = null;

        System.gc();
    }
}