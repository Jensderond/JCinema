package com.jensderond.Data;

import java.util.List;

public class TextStorage implements DataStorage {

    @Override
    public List<String> getData() {
        return null;
    }

    @Override
    public boolean setData(String data) {
        System.out.println("***  TEXT  ***");
        System.out.println(data);
        return true;
    }
}
