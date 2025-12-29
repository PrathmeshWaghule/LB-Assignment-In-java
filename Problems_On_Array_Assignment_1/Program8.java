/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and check whether that 
                   numbers are contains 11 in it or not 
                                                            
    case 1:                                                       

        InPut : 5
                (10     15       11       33      20)                                                                                        
        
        output : 11 is present 

    case 2:                                                       
    
        InPut :  5
                ( 11    33   11       3       22)

        OutPut : 11 is absent 
                                                             
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

    public boolean diffevenAndOddFrequency()
    {
        int i = 0 ;

        for(i = 0 ; i < iLen ; i++)
        {
            if(Arr[i] == 11)
            {
                return true;
            }
        }

        return false;
    }

}

class Program8
{

    public static void main(String A[])
    {

        int p[] ;
        int iSize = 0 , iCnt = 0 ;
        boolean bRet = false;

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

        bRet = pobj.diffevenAndOddFrequency();

        if(bRet == true)
        {
            System.out.println("11 is Present..!");
        }
        else
        {
            System.out.println("11 is Absent..!");
        }
        

        p = null;
        sobj = null;
        pobj = null;

        System.gc();

    }
}