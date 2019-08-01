package com.practise1;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  19:10:56
 */
public class ShieldWords {

    static String[] str = {"隐私","淫秽", "色情", "赌博", "迷信", "恐怖", "暴力", "性别歧视"};

    public static String stringTool(String string){
        for(int i = 0;i<str.length;i++){
            string = string.replace(str[i],"**");
        }
        return string;
    }

}
