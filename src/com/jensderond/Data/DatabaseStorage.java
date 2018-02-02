package com.jensderond.Data;

public class DatabaseStorage implements DataStorage {

    @Override
    public String getData() {
        return null;
    }

    @Override
    public boolean setData(String data) {
        System.out.println("***  DATABASE  ***");
        System.out.println(data);
        return true;
    }
}
