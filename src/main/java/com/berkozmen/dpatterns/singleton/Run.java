package com.berkozmen.dpatterns.singleton;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
        LazyInitializationSingleton.getLazySingleton().singletonTest();
        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
        BillPughSingleton.getInstance().singletonTest();
    }
}
