package com.practise2;

/**
 * 工具类，定义可以精确到小数点四舍五入的方法
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  18:28:49
 */
public class MathTool {

    public static double reRound(double a,double b) {
        //以10为底，求10的b次幂
        b = Math.pow(10,b);
        a = a*b;
        a = Math.round(a);
        a = a/b;
        return a;
    }
}
