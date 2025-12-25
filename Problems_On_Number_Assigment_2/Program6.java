/*                                                        
    Function_Name :   displayRange()                      
                                                            
    Description :  Accept range number from user and display 
                   all even number between them
                                                            
    case 1:                                                       

        InPut : 10     20                                                                                        
        output : 10	 12	 14  16  18	 20

    case 2:                                                       
    
        InPut : -10     5                                                                                                
        output : -10 -8	 -6	 -4	 -2	  0  2	4	                                    
                                                             
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

        void displayEvenRange()
        {
            int iCnt = 0 ;

            if(this.iNo1 <= this.iNo2)
            {
                for(iCnt = this.iNo1 ; iCnt <= this.iNo2 ; iCnt++)
                {
                    if(iCnt % 2 == 0)
                    {
                        System.out.print(iCnt +"\t");
                    }
                }
            }
            else
            {
                System.out.print("Invalit Input...!");
            }
        
            System.out.println();
        }
}

class Program2
{
    public static void main(String A[])
    {

        Scanner sObj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter first number");
        iValue1 = sObj.nextInt();

        System.out.println("Enter second number");
        iValue2 = sObj.nextInt();

        Display dobj = new Display(iValue1,iValue2);
        
        dobj.displayEvenRange();
    }
}