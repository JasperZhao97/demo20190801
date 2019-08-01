package com.practise1;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年08月01日  19:17:33
 */
public class ShieldWordsTest {

    public static void main(String[] args) {
        String text =
                "　  1、使用“国家级”、“最高级”、“最佳”、“第一”等用语；\n" +
                        "　　2、危害人身、财产安全，泄露个人隐私，包含联系方式等；\n" +
                        "　　3、含有淫秽、色情、赌博、迷信、恐怖、暴力的内容等较敏感词汇的；\n" +
                        "　　4、含有民族、种族、宗教、性别歧视的内容；\n" +
                        "　　5、法律、行政法规规定禁止的其他情形。";

        System.out.println("------------------------------------------------------------");
        System.out.println(ShieldWords.stringTool(text));
        System.out.println("------------------------------------------------------------");
    }
}
