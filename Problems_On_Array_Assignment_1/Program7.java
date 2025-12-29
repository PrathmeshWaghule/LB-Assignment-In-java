/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and return 
                   diffrence between frequency of even number and ood number 
                                                            
    case 1:                                                       

        InPut : 5
                (10     15       11       33      20)                                                                                        
        
        output : (2 -3) = -1

    case 2:                                                       
    
        InPut :  5
                ( 15    33   111       3       22)

        OutPut : (1 - 4) = -3   
                                                             
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 20-Dec-2025                                      
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

    public int diffevenAndOddFrequency()
    {
        int i = 0 , evenCnt = 0 , oddCnt = 0;

        for(i = 0 ; i < iLen ; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                evenCnt++;
            }
            else
            {
                oddCnt++;
            }
        }

        return (evenCnt - oddCnt);
    }

}

class Program7
{

    public static void main(String A[])
    {

        int p[] ;
        int iSize = 0 , iCnt = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to store : ");
        iSize = sobj.nextInt();

        if(iSize == 0)
        {
            System.out.println("Invalid size...!");
            return;
        }

        p = new int[iSize];

        System.out.println("Enter "+iSize +" elemnts : ");

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            p[iCnt] = sobj.nextInt();
        }

        ProblemsOnArray pobj = new ProblemsOnArray(p,iSize);

        iRet = pobj.diffevenAndOddFrequency();

        System.out.println("diffrence between Even count and Odd count frequency is  : "+iRet);

        p = null;
        sobj = null;
        pobj = null;

        System.gc();

    }
}