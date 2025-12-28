/*                                                        
    Function_Name :   displayElements()                      
                                                            
    Description :  Accept N number from user and dispaly all 
                   scah elements which is divided by 5 and 3
                                                            
    case 1:                                                       

        InPut : 5
                (10     15       13       14      20)                                                                                        
        
        output : 10   20

    case 2:                                                       
    
        InPut :  5
                ( 20    30      5       3       17)

        OutPut : 20     30          
                                                             
    Author : Prathmesh Ashok Waghule                        
                                                            
    Date : 20-Dec-2025                                      
*/

import java.util.Scanner;


class ProblemsOnArray
{
    public int Arr[];
    public int iLen ;

    public ProblemsOnArray(int A[] , int B)
    {
       Arr = A;
       iLen = B; 
    }

    public void displayElements()
    {
        int i = 0;

        for(i = 0 ; i < iLen ; i++)
        {
            if((Arr[i] % 5 == 0) && (Arr[i] % 3 == 0))
            {
                System.out.print(Arr[i]+"\t");
            }
        }
    }
}
class Program4
{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int p[];
        int iSize = 0 , iCnt = 0;

        

        System.out.println("Enter number of elements you want to enter : ");
        iSize = sobj.nextInt();

        if(iSize == 0)
        {
            System.out.println("Invalid input...!");
            return;
        }

        p = new int[iSize];

        ProblemsOnArray pobj = new ProblemsOnArray(p,iSize);

        System.out.println("Enter "+iSize +" elements");

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            p[iCnt] = sobj.nextInt();
        }

        System.out.print("elements which is divisible 5 and 3 is : ");
        pobj.displayElements();
        System.out.println();

        p = null;
        sobj = null;
        pobj = null;

        System.gc();
    }
}