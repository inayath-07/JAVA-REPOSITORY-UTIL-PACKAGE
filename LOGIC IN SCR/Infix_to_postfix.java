/*this program will convert the infix expression to postfix expression*/

class Postfix
{
    public void infix_Scan(String exp)
    {
        for(int i = 0;i<exp.length();i++)
        {
            if(Character.isLetter(exp.charAt(i)))
            {
                
            }
        }
    }
}
public class Infix_to_postfix
{
    public static void main(String[] args)
    {
        System.out.println("---\"Infix to Postfix\"---");
    }    
}

/*@Algorithm
 * Step 1:scan the give expression from left to right
 * step 2:initialize an empty stack
 * step 3:if the scaned character is operand then add it to postfix string
 * step 4:if it is operator then simply push it to stack
 * step 5:while pushing if the stack is not empty then check the priority of the operator
 * step 6:if the top most element has higher priority then add it to expression
 * step 7:repeate this process till all elements are converted to postfix 
*/