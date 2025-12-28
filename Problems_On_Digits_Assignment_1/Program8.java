/*                                                        
    Function_Name :   countFrequency()                      
                                                            
    Description :  Accept number from user and return
                   multiplication of all digits 
                                                            
    case 1:                                                       

        InPut : 2337                                                                                        
        output : 126


    case 2:                                                       
    
        InPut : 1454                                                                                            
        output : 80
                                              
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
        int iMul = 1;

        while(this.iNo != 0)
        {
            iTemp = this.iNo % 10;
            iMul = iMul * iTemp;
            this.iNo = this.iNo / 10;
        }

        return iMul;
    }
     
}

class Program8
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
        
        System.out.println("Multiplication of all digits in  " + iValue + " is : " + iRet);


        sobj = null;
        pobj = null;

        System.gc();
    }
}