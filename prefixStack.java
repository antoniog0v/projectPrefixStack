
package com.mycompany.problem1;

import java.util.*;

public class prefixStack {
    
    static Stack<Integer> prefixStack;
    
    public prefixStack(){
    //Create prefix stack
    prefixStack = new Stack<>();
        
    
    }
    //Push method (Add to the top)
    public void push (int n){
            prefixStack.push(n);
    }
    //Check if the stack is empty
    public boolean isEmpty(){
            return prefixStack.isEmpty();

    }
    //Pop method (Get rid of the top)
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
            return prefixStack.pop();
        }
    //Peek method (Print the top of the stack)
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
            return prefixStack.peek();
        }
    }


