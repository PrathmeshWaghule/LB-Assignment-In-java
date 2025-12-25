/*                                                        
    Function_Name :   displayRange()                      
                                                            
    Description :  Accept range number from user and retrun
                    addition of all even range (range shoud contain only positive number)
                                                            
    case 1:                                                       

        InPut : 23     30                                                                                        
        output : 212

    case 2:                                                       
    
        InPut : -10     5                                                                                                
        output : Invalid Input...!	                                    
                                                             
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 19-Dec-2025                                      
*/

import java.util.Scanner;

class Display
{

    public

        int iNo1;
        int iNo2;

        Display(int A , int B)
        {
            this.iNo1 = A;
            this.iNo2 = B;
        }

        int displayRangeSum()
        {
            int iCnt = 0 ;
            int iSum = 0;

            if((this.iNo1 <= this.iNo2) && (this.iNo1 > 0 && this.iNo2 > 0))
            {
                for(iCnt = this.iNo1 ; iCnt <= this.iNo2 ; iCnt++)
                {
                    if(iCnt % 2 == 0)
                    {
                        iSum = iSum + iCnt;
                    }
                }
            }
            else
            {
                System.out.println("Invalid Input...!");
            }

            return iSum;
        }
}

class Program4
{
    public static void main(String A[])
    {

        Scanner sObj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        System.out.println("Enter first number");
        iValue1 = sObj.nextInt();

        System.out.println("Enter second number");
        iValue2 = sObj.nextInt();

        Display dobj = new Display(iValue1,iValue2);
        
        iRet = dobj.displayRangeSum();

        if(iRet != 0)
        {
            System.out.println("Sum of range is : "+iRet);
        }
        
    }
}