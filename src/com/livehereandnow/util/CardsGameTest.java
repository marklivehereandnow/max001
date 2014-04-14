/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.util;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author mark
 */
public class CardsGameTest {

    public static void main(String[] args) {
        CardsGame cg = new CardsGame();
        List<Integer> list = cg.getSampleList(20);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

//        http://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
//        for (Integer item : list) {
//            System.out.print(item + " ");
//        }
//        System.out.print("\n");
    }
}
