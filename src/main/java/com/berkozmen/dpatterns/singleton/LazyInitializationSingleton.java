package com.berkozmen.dpatterns.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton lazySingleton;

    private LazyInitializationSingleton(){

    }

    public static LazyInitializationSingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazyInitializationSingleton();
        }
        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy Initialization Singleton method working !");
    }


}
