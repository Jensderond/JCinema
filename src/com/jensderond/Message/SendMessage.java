package com.jensderond.Message;

import com.jensderond.Customer;

public interface SendMessage {
    boolean sendMessage(String data, Customer customer);
}
