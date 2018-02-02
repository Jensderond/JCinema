package com.jensderond.Message;

public class WhatsappMessage implements SendMessage {
    @Override
    public boolean sendMessage(String data) {
        return false;
    }
}
