package com.jensderond.Message;


public class MessageFactory {

    public SendMessage getMessageType(String messageType){
        if(messageType == null){
            return null;
        }
        if(messageType.equalsIgnoreCase("EMAIL")){
            return new EmailMessage();

        } else if(messageType.equalsIgnoreCase("SMS")){
            return new SmsMessage();

        } else if(messageType.equalsIgnoreCase("WHATSAPP")){
            return new WhatsappMessage();
        }

        return null;
    }

}
