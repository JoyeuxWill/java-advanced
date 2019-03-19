package com.soft1841;

/**
 * Integer类的联系
 * @author Jiayue
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 666;
        //调用Integer类的方法，将num进行进制转换
        //二进制
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制："  + str1);
        //八进制
        String str2 = Integer.toOctalString(num);
        System.out.println("八进制：" + str2);
        //十六进制
        String str3 = Integer.toHexString(num);
        System.out.println("十六进制：" + str3);
        System.out.println("--------------------------------------------------------------");
        System.out.println("转化9进制："+ convert(num,9));
    }
        private static String convert(int num,int radix){
        //将num转换为任意radix进制
            //创建一个StingBuffer，用来存放字符串
        StringBuffer stringBuffer = new StringBuffer();
        //被除数不为0，则循环
        while (num != 0){
            //求出余数
            int remainder = num % radix;
            //将余数加入StringBuffer
            stringBuffer.append(remainder);
            //更新被除数为商
            num = num / radix;
        }
        //将结果取反返回
        return stringBuffer.reverse().toString();
    }
}
