package com.aka.jet.common.messages;

import com.aka.jet.common.bean.Board;
import com.aka.jet.common.bean.Route;
import com.aka.jet.common.bean.Source;
import com.aka.jet.common.bean.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class OfficeBoardMessage extends Message{
    private Route route;

    public OfficeBoardMessage() {
        this.source = Source.OFFICE;
        this.type = Type.ROTE;
    }

    public OfficeBoardMessage(Route val) {
        this();
        this.route = val;
    }
}
