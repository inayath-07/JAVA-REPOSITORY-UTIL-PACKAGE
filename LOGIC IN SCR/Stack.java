/*this program will demonstrate the stack */

//importing packages
import java.util.Scanner;
public class Stack
{
    public static void main(String[] args)
    {
        System.out.println("--- \"STACK\"---");
        //declaration of variable
        int ch,s,tos=-1,ele,i;
        int Stack[] = new int[10];

        //creating SCR object
        try
        (Scanner in = new Scanner(System.in))
        {
            System.out.println("enter the size of stack under 10");
            s = in.nextInt();
            while(true)
            {
                System.out.println("1 to push the element");
                System.out.println("2 to pop the element ");
                System.out.println("3 to display ");
                System.out.println("4 to exit ");

                System.out.println("enter your choice :");
                ch = in.nextInt();

                System.out.println("-------------------------");

                switch(ch)
                {
                    case 1:
                    {
                        if(tos<s-1)
                        {
                            System.out.println("yes bro i am empty you can enter");
                            ele = in.nextInt();

                            tos++;
                            Stack[tos] = ele;
                        }
                        else
                        System.out.println("sorry no place");
                        break;
                    }
                    case 2:
                    {
                        if(tos<0)
                        {
                            System.out.println("stack is empty");
                        }
                        else
                        {
                            System.out.println("the deleted element is "+Stack[tos]);
                            tos--;
                        }
                        break;
                    }
                    case 3:
                    {
                        if(tos>-1)
                        {
                            for(i = 0;i<tos;i++)
                            {
                                System.out.println(Stack[i]);
                            }
                        }
                        break;
                    }

                    case 4:
                    System.exit(0);

                    default :
                    System.out.println("enter correct choice");
                }
            }
        }
    }
}
/*@Note
 * stack is a abstract data type that holds an orderd,
 * linear sequence of item
 * 
 * there are 2 operation of stack 
 * 1.push : inserting element in stack
 * 2.pop : removing elemnt from stack
*/