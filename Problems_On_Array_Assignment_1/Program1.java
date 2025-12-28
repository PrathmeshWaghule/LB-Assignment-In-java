/*                                                        
    Function_Name :   DiffEvenOdd()                      
                                                            
    Description :  Accept N number from user and return diffrence between 
                   summation of even elements and odd elements 
                                                            
    case 1:                                                       

        InPut : 5
                (12     1       3       14      5)                                                                                        
        
        output : (26 - 9 )
                Ans = 17

    case 2:                                                       
    
        InPut :  5
                ( 20    30      5       3       17)

        OutPut : 25      
                                                             
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
        Arr = A;
        iLen = B; 
    }

    public int DiffEvenOdd()
    {
        
        int i = 0 , iAns = 0 , evenCnt = 0 , oddCnt = 0;

        for(i = 0 ; i < iLen ; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                evenCnt = evenCnt + Arr[i];
            }
            else
            {
                oddCnt = oddCnt + Arr[i];
            }
        }

        iAns = (evenCnt-oddCnt);
        return iAns;
    }
    
}

class Program1
{

    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int p[];
        int iSize = 0 , iCnt = 0 , iRet = 0;

        System.out.println("Enter how many elemnts you want to store : ");
        iSize = sobj.nextInt();

        p = new int[iSize];

        if(p == null)
        {
            System.out.println("Enable to allocate the memory...!");
            return ;
        }
        
        System.out.println("Enter " +iSize +" elements : ");

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            p[iCnt] = sobj.nextInt();
        }

        ProblemsOnArray pobj = new ProblemsOnArray(p , iSize);

        iRet = pobj.DiffEvenOdd();

        System.out.println("Diffrence of even count and odd count is : "+iRet);

        p = null;
        sobj = null;
        pobj = null;

        System.gc();

    }
}