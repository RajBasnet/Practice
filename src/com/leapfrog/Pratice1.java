/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

import com.leapfrog.enitity.Television;
import com.leapfrog.util.Algorithm;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Pratice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] subjects = {"English", "Maths", "Computer"};
        int[] marks = new int[subjects.length];
        int total = 0;
        int PassMarks = 40;

        boolean isFail = false;

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter the marks for " + subjects[i]);
            marks[i] = input.nextInt();
            total += marks[i];
            if (marks[i] < PassMarks) {
                isFail = true;

            }

        }
        System.out.println("Total:" + total);
        if (!isFail){
            //percentage
                   // grade
                    }
        else{
            System.out.println("You have failed");
        }

    }

}
