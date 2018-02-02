package com.jensderond.Data;

public class TextStorage implements DataStorage {

    @Override
    public String getData() {
        return null;
    }

    @Override
    public boolean setData(String data) {
        System.out.println("***  TEXT  ***");
        System.out.println(data);
        return true;
    }
}
