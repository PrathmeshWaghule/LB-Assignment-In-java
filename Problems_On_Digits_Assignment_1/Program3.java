/*                                                        
    Function_Name :   countFrequency()                      
                                                            
    Description :  Accept number from user and count Frequency
                   of 2 
                                                            
    case 1:                                                       

        InPut : 2339                                                                                        
        output : 1

    case 2:                                                       
    
        InPut : 2255                                                                                                
        output : 2
                                                             
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
            if(iTemp == 2)
            {
                iCnt++;
            }
            this.iNo = this.iNo / 10;
        }

        return iCnt;
    }
     
}

class Program3
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
        
        System.out.println("Frequency of 2 in " + iValue + " is : " + iRet);


        sobj = null;
        pobj = null;

        System.gc();
    }
}