/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.util;

/**
 *
 * @author Dell
 */
public class Algorithm {

    public static int[] sort(int[] numbers, boolean asc) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (asc) {

                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                } else {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        return numbers;
    }

    public static boolean LinearSearch(int[] numbers, int input) {
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == input) {
                return true;

            }
        }
        return false;
    }
}
