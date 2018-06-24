package com.myProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class myMain {
    public static void main(String[] args){
        //创建一个invocationhandler 对象
        InvocationHandler invocationHandler  =  new MyInvocationHandler(new PersonImpl());
        //用制定的invocationHandler来生成一个动态代理对象
         Person proxy = (Person)Proxy.newProxyInstance(PersonImpl.class.getClassLoader(),PersonImpl.class.getInterfaces(),invocationHandler);

         //调用代理对象proxy的任何方法时都会被替换成调用invoke方法
        proxy.talk();
        proxy.walk();
    }
}
