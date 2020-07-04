package com.guigu;

import java.util.ArrayList;

/**
 *注释ctrl+/
 * 
 */


public class HelloWold {
    //模板一:main方法  psvm后 回车
    public static void main(String[] args)
    {
        //模板二:输出换行---sout
        System.out.println();
        //模板三:带参输出soutp--soutm方法--soutv变量(就近选择)
        System.out.println("args = [" + args + "]");

        int num1=8;
        //模板四:出变量,,num1.sout
        System.out.println(num1);
        
        String []arr=new String[]{"dd"};
        //模板五:fori
        for (int i = 0; i <56 ; i++) {
            
        }
        //   直接赋值--itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //模板六:foreach----iter
        for (String ps : arr) {

        }
        //模板七:list.for fori forr 普通,正序,逆序
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer integer : list) {
            //list.for生成
        }
        //模板六 ifn inn判断为空与不为空
//            ifn
        if (list == null) {
            ;
        }
//            inn
        if (list != null) {
            ;
        }


    }

}
