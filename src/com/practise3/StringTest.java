package com.practise3;

/**
 * 将字符转换成指定字符
 *
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  19:21:33
 */
 /*enum num{
   num,num1,num1,num1,num1,num1,num1,num1,num1,num1,
}*/

public class StringTest {

    public static void main(String[] args) {
        String str1 = "ttt5yjd-jdd4yh"; //tttyyyyyjd@jddyyyyh
        String str2 = "Hsdkf4sd-fsd3tr";//Hsdkfssssd@fsd3tttr
        str1 = StringService.stringTool(str1);
        str2 = StringService.stringTool(str2);
    }
}
