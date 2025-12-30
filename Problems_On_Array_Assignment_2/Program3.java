/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and accept one another as NO
                    check whether No is Present or NOT                                            
    case 1:                                                       

        InPut : 5
                (10     15       11       33      20) 

                Enter number to check : 11                                                                                       
        
        output : Present

    case 2:                                                       
    
        InPut :  5
                ( 11    33   11       3       22)

                Enter number to check : 2

        OutPut : Not Present 
                                                             
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 21-Dec-2025                                      
*/


import java.util.Scanner;

class ProblemsOnArray
{
    
    public int Arr[];
    public int iLen;
    public int searchNum ;

    public ProblemsOnArray(int A[] , int B , int C)
    {
        this.Arr = A;
        this.iLen = B;
        this.searchNum = C;
    }

    public boolean checkNumber()
    {
        int i = 0 , iAns = 0;
        
        for(i = 0 ; i < this.iLen ; i++)
        {
            if(this.Arr[i] == this.searchNum)
            {
                return true;
            }
            
        }
        return false;
    }
}
class Program3
{

    public static void main(String A[])
    {
        int p[];    
        int iSize = 0 , iCnt = 0 , No = 0;
        boolean bRet = true;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you wnat to store :");
        iSize = sobj.nextInt();

        if(iSize == 0)
        {
            System.out.println("Invalid input...!");
            return;
        }

        p = new int[iSize];

        System.out.println("Enter search number");
        No = sobj.nextInt();
        
        System.out.println("Enter "+iSize +" Elements : ");

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            p[iCnt] = sobj.nextInt();
        }   

        ProblemsOnArray pobj = new ProblemsOnArray(p,iSize,No);

        bRet = pobj.checkNumber();

        if(bRet == true)
        {
            System.out.println(No +" is Present");
        }
        else
        {
            System.out.println(No +" is Not Present");   
        }


    }
}