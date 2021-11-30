package com.company;

import java.util.HashMap;

public class Passwords {

    private HashMap<String,Person> dataBase;

    //------------------------------------------------------------------------------------------------------------------

    Passwords(){
        dataBase = new HashMap<>();
    }

    //------------------------------------------------------------------------------------------------------------------

    public void addUserAndPassword(Person user, String password){
        dataBase.put(password, user);
    }

    //------------------------------------------------------------------------------------------------------------------

    public void showDataBase(){
        for(Person e : dataBase.values()){
            System.out.println(e);
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public HashMap<String, Person> getDataBase() {
        return dataBase;
    }

}
