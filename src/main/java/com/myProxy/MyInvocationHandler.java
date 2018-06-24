package com.myProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private PersonImpl personImpl;

    public MyInvocationHandler(PersonImpl p){
        this.personImpl = p ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke...");
        return method.invoke(personImpl,args);
    }
}
