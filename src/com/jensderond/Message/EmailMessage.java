package com.jensderond.Message;

public class EmailMessage implements SendMessage {
    @Override
    public boolean sendMessage(String data) {
        return false;
    }
}
