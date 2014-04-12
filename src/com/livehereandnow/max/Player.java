/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author max
 */
public class Player {

//  A{文明,食物,资源,科技}={0,0,0,0}
    private int 文明;
    private int 食物;
    private int 資源;
    private int 科技;
    
    private int 農業;
    private int 礦場;
    private int 神廟;
    private int 實驗室;
    private int 戰士;
    
    private int 工人閒置區;
    private int 黃點工人供應區;
    private int 藍點資源供應區;

    public int get農業() {
        return 農業;
    }

    public void set農業(int 農業) {
        this.農業 = 農業;
    }

    public int get礦場() {
        return 礦場;
    }

    public void set礦場(int 礦場) {
        this.礦場 = 礦場;
    }

    public int get神廟() {
        return 神廟;
    }

    public void set神廟(int 神廟) {
        this.神廟 = 神廟;
    }

    public int get實驗室() {
        return 實驗室;
    }

    public void set實驗室(int 實驗室) {
        this.實驗室 = 實驗室;
    }

    public int get戰士() {
        return 戰士;
    }

    public void set戰士(int 戰士) {
        this.戰士 = 戰士;
    }

    public int get工人閒置區() {
        return 工人閒置區;
    }

    public void set工人閒置區(int 工人閒置區) {
        this.工人閒置區 = 工人閒置區;
    }

    public int get黃點工人供應區() {
        return 黃點工人供應區;
    }

    public void set黃點工人供應區(int 黃點工人供應區) {
        this.黃點工人供應區 = 黃點工人供應區;
    }

    public int get藍點資源供應區() {
        return 藍點資源供應區;
    }

    public void set藍點資源供應區(int 藍點資源供應區) {
        this.藍點資源供應區 = 藍點資源供應區;
    }

    public List<String> get手上的牌() {
        return 手上的牌;
    }

    public void set手上的牌(List<String> 手上的牌) {
        this.手上的牌 = 手上的牌;
    }
    
    
    private List <String>手上的牌;
    

    public Player() {
        文明 = 0;
        食物 = 0;
        資源 = 0;
        科技 = 0;
        手上的牌= new ArrayList<String>() ;
    }

    public int get文明() {
        return 文明;
    }

    public void set文明(int 文明) {
        this.文明 = 文明;
    }
    public void set起始(int 農業, int 礦場, int 實驗室, int 神廟,int 戰士,int 工人閒置區) {
        this.工人閒置區 = 工人閒置區;
        this.農業 = 農業;
        this.礦場 = 礦場;
        this.神廟 = 神廟;
        this.實驗室 = 實驗室;
        this.戰士 = 戰士;
    }

    public void set文明食物資源科技(int 文明, int 食物, int 資源, int 科技) {
        this.文明 = 文明;
        this.食物 = 食物;
        this.資源 = 資源;
        this.科技 = 科技;
    }

    public int get食物() {
        return 食物;
    }

    public void set食物(int 食物) {
        this.食物 = 食物;
    }

    public int get資源() {
        return 資源;
    }

    public void set資源(int 資源) {
        this.資源 = 資源;
    }

    public int get科技() {
        return 科技;
    }

    public void set科技(int 科技) {
        this.科技 = 科技;
    }
    
    public void do拿取(int 內政點數,String 內政牌) {
        手上的牌.add(內政牌);
    }
    
    public void show手上的牌() {
        
        
        for(int k=0;k<手上的牌.size();k++){
            System.out.println(" "+手上的牌.get(k));
        }
    }
    public void show() {
        show手上的牌();
        /*this.工人閒置區 = 工人閒置區;
        this.農業 = 農業;
        this.礦場 = 礦場;
        this.神廟 = 神廟;
        this.實驗室 = 實驗室;
        this.戰士 = 戰士;*/
        System.out.print("  工人閒置區="+工人閒置區);
        System.out.print("  農業="+農業);
        System.out.print("  礦場="+礦場);
        System.out.print("  神廟="+神廟);
        System.out.print("  實驗室="+實驗室);
        System.out.print("  戰士="+戰士);
        System.out.println("  "+toString());
        
    }
    
    @Override
    public String toString() {
        return "現有資源{" + "\u6587\u660e=" + 文明 + ", \u98df\u7269=" + 食物 + ", \u8cc7\u6e90=" + 資源 + ", \u79d1\u6280=" + 科技 + '}';
    }

}
