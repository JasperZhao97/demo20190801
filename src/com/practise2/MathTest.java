package com.practise2;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  18:53:19
 */
public class MathTest {

    public static void main(String[] args) {
        double a = 5.223489;
        int b = 5;
        a = MathTool.reRound(a,b);
        System.out.println("小数点后精确"+b+"位后四舍五入为："+a);
    }
}
