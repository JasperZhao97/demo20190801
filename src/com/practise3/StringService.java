package com.practise3;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  20:14:21
 */
public class StringService {

    public static String stringTool(String str) {
        String[] str3 = str.split("");
        for(int i = 0;i<str3.length;i++)
        {
            char[] ch1 = str3[i].toCharArray();
            char ch2 = ch1[0];
            int a = ch2;
            String str4 = "";
            if(ch2>=48&&ch2<=57)
            {
                int b = ch2-48;
                for(;b>1;b--){
                    str4 = str4+str3[i+1];
                    str3[i]=str4;
                }
            }
        }
        for (int i = 0;i<str3.length;i++){
            if(str3[i].equals("-")){
                str3[i]="@";
            }
        }
        for (String str2:str3){
            System.out.print(str2);
        }
        System.out.println();
        /*for (int i =0 ;i<str3.length;i++) {
            if (str3[i].equals("-")) str3[i] = "@";
            if (str3[i].equals("5")) str3[i] = "yyyyy";
            if (str3[i].equals("4")) str3[i] = "yyyy";
            *//*if (str3[i].equals("-")) str3[i] = str3[i].replace("-","@");
            if (str3[i].equals("5")) str3[i] = str3[i].replace("5","yyyyy");
            if (str3[i].equals("4")) str3[i] = str3[i].replace("4","yyyy");*//*
        }
        System.out.println(str);
        System.out.println("替换后为：");
        for (String str2 : str3) {
            System.out.print(str2);
        }
        System.out.println();*/
        return str;
    }
}
