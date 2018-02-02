package com.jensderond.Data;

import java.util.LinkedList;
import java.util.List;

public class EventLogStorage implements DataStorage {

    private List<String> eventLog = new LinkedList<>();

    @Override
    public List<String> getData() {
        return eventLog;
    }

    @Override
    public boolean setData(String data) {
        System.out.println("***  EVENTLOG  ***");
        eventLog.add(data);
        return true;
    }
}
