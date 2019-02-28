/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import java.util.Scanner;

/**
 *
 * @author jamesK
 */
public class JUnitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initiate test
        AssertTypes test = new AssertTypes();
        
        System.out.println("Choose a test to do: ");
        System.out.println("Test 1: A Test that Executes Successfully");
        System.out.println("Test 2: A Test that throws Errors");
        
        Scanner inputRead = new Scanner(System.in);
        int input = inputRead.nextInt();
        
        switch(input) {
            case 1:
                test.PassingTest();
                break;
            case 2:
                test.FailingTest();
                break;
            default:
                System.out.println("FAILED TO INPUT VALID OPTION");
                break;
        }
    }
    
}
