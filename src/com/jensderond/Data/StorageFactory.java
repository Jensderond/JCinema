package com.jensderond.Data;

public class StorageFactory {

    public DataStorage getStorage(String storageType){
        if(storageType == null){
            return null;
        }
        if(storageType.equalsIgnoreCase("TEXT")){
            return new TextStorage();

        } else if(storageType.equalsIgnoreCase("DATABASE")){
            return new DatabaseStorage();

        } else if(storageType.equalsIgnoreCase("EVENT")){
            return new EventLogStorage();
        }

        return null;
    }

}
