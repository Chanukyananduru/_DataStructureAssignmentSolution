package com.gl.Construction;

import java.util.Stack;

public class StackSorting {

    public Stack<Integer> sort(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return null;
        }

        Stack<Integer> sortedStack = new Stack<Integer>();

        int element = 0;
        while(!stack.isEmpty()) {
            if (stack.peek() <= (element = stack.pop())) {
                if (sortedStack.isEmpty()) {
                    sortedStack.push(element);
                } else {
                    while((!sortedStack.isEmpty()) && sortedStack.peek() > element) {
                        stack.push(sortedStack.pop());
                    }
                    sortedStack.push(element);
                }
            }
        }

        return sortedStack;
    }
}