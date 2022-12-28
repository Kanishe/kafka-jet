package com.aka.jet.common.messages;

import com.aka.jet.common.bean.Source;
import com.aka.jet.common.bean.Type;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Message {
    protected Type type;
    protected Source source;

    public String getCode() {
        return source.name() + "_" + type.name();
    }
}
