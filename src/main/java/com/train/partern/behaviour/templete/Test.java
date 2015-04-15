package com.train.partern.behaviour.templete;

public class Test {

    public static void main(String[] args) {
        Template temp = new TemplateConcrete();
        temp.update();//控制反转，调用父亲的方法
    }
}
