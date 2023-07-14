package org.designpattern.singleton;

public class Singleton {

    // it is used to create only one single object
    private static Singleton instance;

    static {
        try{
            instance = new Singleton();
        }
        catch (Exception ex){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
