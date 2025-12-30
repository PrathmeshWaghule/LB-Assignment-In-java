/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and return frequency  
                   of 11 from it 
                                                            
    case 1:                                                       

        InPut : 5
                (10     15       11       33      20)                                                                                        
        
        output : 1 

    case 2:                                                       
    
        InPut :  5
                ( 11    33   11       3       22)

        OutPut : 2 
                                                             
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

    public int checkNumberFreq()
    {
        int i = 0 , iAns = 0;
        
        for(i = 0 ; i < this.iLen ; i++)
        {
            if(this.Arr[i] == this.searchNum)
            iAns++;
        }

        return iAns;
    }
}
class Program2
{

    public static void main(String A[])
    {
        int p[];    
        int iSize = 0 , iRet = 0 , iCnt = 0 , No = 0;

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

        iRet = pobj.checkNumberFreq();

        System.out.println("Frequency of "+No +" is : "+iRet); 
    }
}