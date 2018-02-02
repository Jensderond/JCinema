package com.jensderond.Data;

public class EventLogStorage implements DataStorage {

    @Override
    public String getData() {
        return null;
    }

    @Override
    public boolean setData(String data) {
        System.out.println("***  EVENTLOG  ***");
        System.out.println(data);
        return true;
    }
}
