/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enitity;

/**
 *
 * @author Dell
 */
public class Television {

    private Television() {

    }

    public static Television getInstance() {
        return new Television();

    }

    public void play() {

        System.out.println("Playing tv");
    }
}
