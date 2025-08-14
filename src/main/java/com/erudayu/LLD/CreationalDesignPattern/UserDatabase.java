package com.erudayu.LLD.CreationalDesignPattern;

/*
* Singleton Design pattern
*  -> Ensures only one instance is created
*  -> synchronised ensures the instance creation is thread safe
* */
public class UserDatabase {

    private static UserDatabase instance;

    private UserDatabase(){
    }

    public static synchronized UserDatabase getInstance(){
        if(instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }
}
