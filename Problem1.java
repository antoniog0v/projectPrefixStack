/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problem1;

import java.util.*;

public class Problem1 {

        
    public static void main(String[] args) {
        prefixStack prefixStack = new prefixStack();
        //Pushing numbers onto the stack
        prefixStack.push(5);
        prefixStack.push(4);
        // Testing the methods
        System.out.println("Here is the peek method: " + prefixStack.peek());
        System.out.println("Here is the pop method: " + prefixStack.pop());
        System.out.println("Here is the is empty method: " + prefixStack.isEmpty());
        System.out.println("Here is the pop method again: " + prefixStack.pop());
        System.out.println("Here is the isEmpty method again: " + prefixStack.isEmpty());
    }
}