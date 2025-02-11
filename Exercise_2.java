// Time Complexity : isEmpty = O(1), push = O(1), pop = O(1), peek = O(1)
// Space Complexity : O(n) n being the szie of the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was not popping the element properly

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root==null)
          return true;
        else
          return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root==null)
          root = node;
        else
        {
          StackNode temp = root;
          root = node;
          node.next = temp;
        }
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root==null)
        {
          System.out.println("Stack Underflow");
          return 0;
        }
        else
        {
          int out = root.data;
          root = root.next;
          return out;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root==null)
        {
          System.out.println("Stack Underflow");
          return 0;
        }
        else
        {
          return root.data;
        }
    }

	//Driver code
    public static void main(String[] args)
    {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
