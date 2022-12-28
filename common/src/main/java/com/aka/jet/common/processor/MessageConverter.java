package com.aka.jet.common.processor;

import com.aka.jet.common.messages.Message;
import com.google.gson.Gson;

public class MessageConverter {
    private final Gson gson = new Gson();
    public String extractCode(String data){
        return gson.fromJson(data, Message.class).getCode();
    }
    public <T extends Message> T extractMessages(String data,Class<T>clazz){
        return gson.fromJson(data,clazz);
    }
    public String toString(Object message){
        return gson.toJson(message);
    }
}
