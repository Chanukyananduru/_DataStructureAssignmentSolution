package com.gl.Construction;

import java.util.Stack;

public class StacKSortingDriver {

	public static void main(String[] args) {
		 Stack<Integer> Stack = new Stack<Integer>();
		 Stack.push(20);
		 Stack.push(5);
		 Stack.push(10);
		 Stack.push(3);
		 
		 System.out.println("Before sorting");
		 
		 PrintStack(Stack);
		 
		 StackSorting s = new StackSorting();
		 Stack = s.sort(Stack);
		 System.out.println("After sorting");
		 PrintStack(Stack);
		 
		 

	}
	static void PrintStack(Stack<Integer> s)
	{
	    // If stack is empty then return
	    if (s.isEmpty())
	        return;
	     
	    int x = s.peek();
	 
	    // Pop the top element of the stack
	    s.pop();
	 
	    // Recursively call the function PrintStack
	    PrintStack(s);
	 
	    // Print the stack element starting from the bottom
	    System.out.print(x + " ");
	 
	    // Push the same element onto the stack to preserve the order
	    s.push(x);
	}

}
