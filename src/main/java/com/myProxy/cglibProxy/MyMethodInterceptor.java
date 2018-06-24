package com.myProxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * CGLIB动态代理要实现一个MethodInterceptor，方法调用会被转到该类的intercept
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib invoke...");
        return methodProxy.invokeSuper(o,objects);
    }
    
    public static void main(String[] args){

        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();

        //通过Enhancer 创建代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(myMethodInterceptor);

        //创建代理对象
        Dog dog = (Dog)enhancer.create();
        dog.run();
        dog.walk();

    }
}
