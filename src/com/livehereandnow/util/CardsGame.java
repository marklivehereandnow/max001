/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mark
 */
public class CardsGame {
//    List <int> 

    /**
     * Mark, 4/14/2014, in Kunshan 0 base
     *
     * @param size
     * @return
     */
    public List<Integer> getSampleList(int size) {
        
        List<Integer> result = new ArrayList<Integer>();
        for (int k = 0; k < size; k++) {
            result.add(k);
        }
        return result;
    }    

}
