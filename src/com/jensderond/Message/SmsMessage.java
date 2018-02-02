package com.jensderond.Message;

public class SmsMessage implements SendMessage {
    @Override
    public boolean sendMessage(String data) {
        return false;
    }
}
