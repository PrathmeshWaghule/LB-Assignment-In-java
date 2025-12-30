/*                                                        
    Function_Name :   returnSmallest()                      
                                                            
    Description :  Accept N number from user and return largest number

    case 1:                                                       

        InPut : 5
                (10     15       11       33      20)                                                                                    
        
        output : 10

    case 2:                                                       
    
        InPut :  5
                ( 11    33   111       3       11)

        OutPut : 3
                                                             
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 21-Dec-2025                                      
*/


import java.util.Scanner;

class ProblemsOnArray
{

    public int Arr[];
    public int iLen;

    public ProblemsOnArray(int A[] , int B)
    {
        this.Arr = A;
        this.iLen = B;
    }

    public int returnSmallest()
    {
        int iAns = Arr[0] , i = 0;
        
        for(i = 0 ; i < iLen ; i++)
        {
            if(iAns > Arr[i])
            {
                iAns = Arr[i];
            }
        }
        
        return iAns;
    }
}

class Program9
{

    public static void main(String A[])
    {

        int p[];
        int iSize = 0 , iCnt = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you wnat to store :");
        iSize = sobj.nextInt();

        p = new int[iSize];

        System.out.println("Enter "+iSize +" elements :");

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            p[iCnt] = sobj.nextInt();
        }

        ProblemsOnArray aobj = new ProblemsOnArray(p,iSize);

        iRet = aobj.returnSmallest();

        System.out.println("Smallest number in all elemnets is : "+iRet);

        p = null;
        sobj = null;
        aobj = null;

        System.gc();

    }
}