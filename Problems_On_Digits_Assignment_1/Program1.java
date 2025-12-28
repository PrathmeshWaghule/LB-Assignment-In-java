/*                                                        
    Function_Name :   displayDigitInRevers()                      
                                                            
    Description :  Accept range number from user and display its 
                   digits in revers order
                                                            
    case 1:                                                       

        InPut : 2330                                                                                        
        output : 0 
                 3
                 3
                 2

    case 2:                                                       
    
        InPut : 105                                                                                                
        output : 5
                 0
                 1
                                                             
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

    public void displayDigitInRevers() 
    {
        int iTemp = 0;
        
        while(this.iNo != 0)
        {
            iTemp = this.iNo % 10;
            System.out.println(iTemp);
            this.iNo = this.iNo / 10;
        }
    }

}

class Program1
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();


        ProblemsOnDigits pobj = new ProblemsOnDigits(iValue);
        pobj.displayDigitInRevers();

        sobj = null;
        pobj = null;

        System.gc();
    }
}