package com.aka.jet.common.messages;

import com.aka.jet.common.bean.AirPort;
import com.aka.jet.common.bean.Board;
import com.aka.jet.common.bean.Source;
import com.aka.jet.common.bean.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BoardStateMessage extends Message {

    private Board board;

    public BoardStateMessage() {
       this.source = Source.BOARD;
       this.type = Type.STATE;
    }

    public BoardStateMessage(Board val) {
        this();
        this.board = val;
    }
}
