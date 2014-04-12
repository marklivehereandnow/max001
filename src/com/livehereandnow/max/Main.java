/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max;

/**
 *
 * @author max
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("第一回合開始");
        System.out.println("玩家1" + p1.toString());
        System.out.println("玩家2" + p2.toString());
        //初始狀態
        p1.set起始(2, 2, 1, 0, 1, 1);
        p2.set起始(2, 2, 1, 0, 1, 1);
        p1.set文明食物資源科技(0, 0, 0, 0);
        p2.set文明食物資源科技(0, 0, 0, 0);
        
        //模擬第一回合的動作
        p1.do拿取(1, "[亞里士多得]");

 


        System.out.println("第一回合結束");
        System.out.println("玩家1");
        p1.show();
        System.out.println("玩家2");
        p2.show();
    }

}
