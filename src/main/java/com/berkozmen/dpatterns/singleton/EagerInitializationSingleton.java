package com.berkozmen.dpatterns.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }

    private EagerInitializationSingleton(){

    }

    public void singletonTest(){
        System.out.println("Eager Initialization Singleton method working !");
    }
}
