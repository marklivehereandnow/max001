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
public class Main implements CardType {
//時代A共有20張牌遊戲開始時 隨機選出13張牌
    //public Card(int 編號, String 卡名, int 時代, int 類型
    // Card[] showcards=new Card[13];

    Card card0 = new Card();

    Card card1 = new Card();
    Card card2 = new Card();
    Card card3 = new Card(3, "亞里士多得", 0, CardType.領袖);
    Card card18 = new Card(18, "建築工地", 0, CardType.黃牌);
    Card card21 = new Card(21, "摩西", 0, CardType.領袖);
    Card card27 = new Card(27, "空中花園", 0, CardType.奇蹟);
    Card card28 = new Card(28, "藝術作品", 0, CardType.黃牌);

    Card show0 = card3;
    Card show1 = card27;
    Card show2 = card28;

    List<Card> 檯面13張 = new ArrayList<Card>();
    List<Card> 時代內政牌 = new ArrayList<Card>();
    //大概150張.包含4個時代.我們先以2人遊戲為基礎框架，訂定出全部內政牌
    //時代A約20張
    //時代I約40張
    //時代II約50張1
    //時代III約40張
    //洗牌時各時代分開洗
    //有些牌會出現2次 如何處理? 
    //理想的編號為何?.如何辨別想要的某張牌
    //有些牌會因為遊戲人數而抽取掉
    //
    List<Card> 洗過的全部內政牌 = new ArrayList<Card>();//大概150張.有些牌會出現2次 如何處理?
    List<Card> 時代A內政牌 = new ArrayList<Card>();
    List<Card> 時代I內政牌 = new ArrayList<Card>();
    List<Card> 時代II內政牌 = new ArrayList<Card>();
    List<Card> 時代III內政牌 = new ArrayList<Card>();
    List<Card> 洗過的時代A內政牌 = new ArrayList<Card>();
    List<Card> 洗過的時代I內政牌 = new ArrayList<Card>();
    List<Card> 洗過的時代II內政牌 = new ArrayList<Card>();
    List<Card> 洗過的時代III內政牌 = new ArrayList<Card>();

//對目前結構不爽
//1.每張牌都要手工設定2次很麻煩，希望可以批量從資料庫匯入資訊
//2.Card3.Card27.Card28以後要調用時很不方便，如何改程陣列的方式?
//3.初值設定時.時代勉強可以使用0.1.2.3表達，但是類型用0.1.2.3表達時有閱讀上的困難，基於目前的不同類型共有
    Card card4 = new Card();
    Card card5 = new Card();
    Card card6 = new Card();
    Card card7 = new Card();
    Card card8 = new Card();
    Card card9 = new Card();
    Card card10 = new Card();
    Card card11 = new Card();
    Card card12 = new Card();

    Player p1 = new Player();
    Player p2 = new Player();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main myGame = new Main();

        myGame.startGame();

    }

    public void 顯示狀態() {

        //    System.out.println("第一回合結束");
        System.out.print("玩家1");
        p1.show();
        System.out.print("玩家2");
        p2.show();
        System.out.println("-------------------------------------------------");

    }
/*    Card card3 = new Card(3, "亞里士多得", 0, CardType.領袖);
    Card card18 = new Card(18, "建築工地", 0, CardType.黃牌);
    Card card21 = new Card(21, "摩西", 0, CardType.領袖);
    Card card27 = new Card(27, "空中花園", 0, CardType.奇蹟);
    Card card28 = new Card(28, "藝術作品", 0, CardType.黃牌);
    */
    public void startGame() {
        時代A內政牌.add(new Card(0, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(1, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(2, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(3, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(4, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(5, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(6, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(7, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(8, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(9, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(10, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(11, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(12, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(13, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(14, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(15, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(16, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(17, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(18, "亞里士多得", 0, CardType.領袖));
        時代A內政牌.add(new Card(19, "亞里士多得", 0, CardType.領袖));

        for (int k = 0; k < 時代A內政牌.size(); k++) {
            System.out.println("   第" + k + "張 " + 時代A內政牌.get(k).卡名);
        }
        System.out.println("-------------------------------------------------");
        檯面13張.add(card3);
        檯面13張.add(card27);
        檯面13張.add(card28);
        檯面13張.add(card21);
        檯面13張.add(card18);

        System.out.println("第一回合開始");
        //  顯示狀態();
        //    System.out.println("玩家1" + p1.toString());
        //   System.out.println("玩家2" + p2.toString());
        //初始狀態
        p1.set起始(2, 2, 1, 0, 1, 1);//表示起始科技卡片上黃點的數量
        //分別代表[農業][礦場][神廟][實驗室][戰士][工人閒置區]
        p2.set起始(2, 2, 1, 0, 1, 1);
        p1.set文明食物資源科技(0, 0, 0, 0);//
        p2.set文明食物資源科技(0, 0, 0, 0);

        System.out.println("初始狀態");
        顯示狀態();
        System.out.println("第一回合開始");
        System.out.println("給第1個玩家1個內政點");
        System.out.println("第1個玩家用唯一的內政點去取得13張牌裡面的其中一張牌");
        System.out.println("目前顯示的前3張牌為");
        /*System.out.println("第0張" + show0.卡名);
         System.out.println("第1張" + show1.卡名);
         System.out.println("第2張" + show2.卡名);
         */
        for (int k = 0; k < 檯面13張.size(); k++) {
            System.out.println("   第" + k + "張 " + 檯面13張.get(k).卡名);

        }
        //假設我要用檯面13張去做全部的卡的話 我要怎麼做
        //

        /*   String card13=亞里士多得
         空中花園
         藝術作品
         摩西
         建築工地
         金字塔
         亞歷山大
         富饒之土
         富饒之土
         節儉
         巨人像
         工程天才
         荷馬*/
        //   p1.do拿取(1, "[亞里士多得]");
        System.out.println("給第2玩家2個內政點");
        // 顯示狀態();
        //模擬第一回合的動作

        顯示狀態();

    }

}
