/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and accept Range , Display
                   all elements from that range                                            
    case 1:                                                       

        InPut : 5
                (10     15       11       33      20) 

                Start : 10
                
                End : 33                                                                                   
        
        output :  10    15      11      33 
                                                             
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

    public void displayRange()
    {
        int iStart = 0 , iEnd = 0 , i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter start number : ");
        iStart = sobj.nextInt();

        System.out.println("Enter end number : ");
        iEnd = sobj.nextInt();

        
        for(i = 0 ; i < iLen ; i++)
        {
            if(Arr[i]>= iStart && Arr[i]<=iEnd)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
        
        System.out.println();
        
    }
}

class Program6
{

    public static void main(String A[])
    {

        int p[];
        int iNo1 = 0 , iNo2 = 0 , iSize = 0 , iCnt = 0;

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

        aobj.displayRange();

        p = null;
        sobj = null;
        aobj = null;

        System.gc();

    }
}