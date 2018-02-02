package com.jensderond.Message;

import com.jensderond.Customer;

import java.util.Properties;

public class SmsMessage implements SendMessage {
    @Override
    public boolean sendMessage(String data, Customer customer) {
        return false;
    }
}
