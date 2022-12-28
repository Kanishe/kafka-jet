package com.aka.jet.common.messages;

import com.aka.jet.common.bean.Source;
import com.aka.jet.common.bean.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class OfficeStateMessage extends Message{

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }
}
