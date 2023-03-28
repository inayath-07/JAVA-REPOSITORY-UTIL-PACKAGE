/*this program is use to sort an array ussing selection sorting technique */

//importing packages
import java.util.Scanner;
public class selection_sorting 
{
    public static void main(String args[])    
    {
        //declaration of variable
        int min,size,i,j,temp;
        
        //creating object of Scanner class
        try
        (Scanner in = new Scanner(System.in))
        {
            System.out.println("enter size of your array ");
            size = in.nextInt();

            //conditional declaration 
            int array[] = new int[size];

            System.out.println("enter array element ");
            for(i = 0;i<size;i++)
            {
                System.out.print((i+1)+".");
                array[i] = in.nextInt();
            }
            
            for(i = 0;i<size-1;i++)
            {
                min = i;
                //genarating minimum number
                for(j = i+1;j<size;j++)
                {
                    if(array[j]<array[min])
                    {
                        min = j;
                    }
                }
                //use to move element on particular position
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

            for(i=0;i<size;i++)
            {
                System.out.println((i+1)+"."+array[i]);
            }
        }
    }
}