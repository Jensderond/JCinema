package com.jensderond.Data;

import java.util.List;

public interface DataStorage {
    List<String> getData();
    boolean setData(String data);
}
