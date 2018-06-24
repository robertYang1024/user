package com.myProxy;

public class PersonImpl  implements Person{
    @Override
    public void walk() {
        System.out.println("walking impl");
    }

    @Override
    public void talk() {
        System.out.println("talking impl");
    }
}
