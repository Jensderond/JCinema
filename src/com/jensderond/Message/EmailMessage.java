package com.jensderond.Message;

import com.jensderond.Customer;

public class EmailMessage implements SendMessage {

    @Override
    public boolean sendMessage(String data, Customer customer) {
        return false;
    }
}
