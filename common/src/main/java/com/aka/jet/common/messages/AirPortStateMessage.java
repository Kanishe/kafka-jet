package com.aka.jet.common.messages;

import com.aka.jet.common.bean.AirPort;
import com.aka.jet.common.bean.Source;
import com.aka.jet.common.bean.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AirPortStateMessage extends Message{
    private AirPort airPort;
    public AirPortStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirPortStateMessage(AirPort airPort) {
        this();
        this.airPort = airPort;
    }
}
