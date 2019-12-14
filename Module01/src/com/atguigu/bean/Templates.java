package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;


/**
 * @description
 * @author: yaojianan
 * @date: 2019-12-13
 */
public class Templates {
    private int num;
    private String num1;

    
    //模板6: prsf
    private static final int i = 1 ;
    //模板1：psvm
    public static void main(String[] args) {

        //模板2： sout
        System.out.println("hello");
        int i =1;
//        soutv输出变量名
        System.out.println("i = " + i);
        //模板3：fori  iter增强for循环
        String[] arr = new String[]{"tom","jerry"};
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }
        //模板4：list.for   list.fori正序遍历  list.forr倒叙遍历
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Object o : list) {
            System.out.println(o);
        }

    }
    public void method(){
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Object o : list) {
            System.out.println(o);
        }
        //模板5：ifn
        if (list == null) {
            System.out.println("list = " + list);
        }
        // inn
        if (list != null) {
            System.out.println("list = " + list);
        }
    }
}
