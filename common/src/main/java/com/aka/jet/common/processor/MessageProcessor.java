package com.aka.jet.common.processor;

import com.aka.jet.common.messages.Message;

public interface MessageProcessor <T extends Message>{
    void process(String jsonMessage);
}
