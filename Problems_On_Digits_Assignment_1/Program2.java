/*                                                        
    Function_Name :   displayDigitInRevers()                      
                                                            
    Description :  Accept number from user and check whether it 
                   contains 0 in it or not
                                                            
    case 1:                                                       

        InPut : 2339                                                                                        
        output : There is no Zero

    case 2:                                                       
    
        InPut : 105                                                                                                
        output : it Contains Zero
                                                             
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

    public boolean ChkInZero() 
    {
        int iTemp = 0;
        
        while(this.iNo != 0)
        {
            iTemp = this.iNo % 10;
            if(iTemp == 0)
            {
                return true;
            }
            this.iNo = this.iNo / 10;
        }

        return false;
    }
     
}

class Program2
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        boolean bRet = true;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();


        ProblemsOnDigits pobj = new ProblemsOnDigits(iValue);
        bRet = pobj.ChkInZero();

        if(bRet == true)
        {
            System.out.println("it contain 0");
        }
        else
        {
            System.out.println("there is no 0");
        }

        sobj = null;
        pobj = null;

        System.gc();
    }
}