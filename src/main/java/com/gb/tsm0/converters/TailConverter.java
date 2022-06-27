package com.gb.tsm0.converters;

import com.gb.tsm0.dto.TailDto;
import com.gb.tsm0.entities.Tail;

public class TailConverter {
    public static TailDto entityToDto(Tail entity){
        TailDto dto = new TailDto();
        dto.setId(entity.getId());
        dto.setOwner(entity.getOwner());
        dto.setTailColor(entity.getTailColor());
        dto.setTailLength(entity.getTailLength());
        return dto;
    }
}
