package com.gb.tsm0.servises;

import com.gb.tsm0.converters.TailConverter;
import com.gb.tsm0.dto.TailDto;
import com.gb.tsm0.entities.Tail;
import com.gb.tsm0.repositories.TailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TailsService {
    private final TailsRepository tailsRepository;


    @Transactional
    public void createTail(TailDto tailDto) {
            Tail tail;
            if (tailDto.id != null){
                tail = tailsRepository.getReferenceById(tailDto.getId());
            }else {
                tail = new Tail();
            }

            tail.setOwner(tailDto.getOwner());
            tail.setTailColor(tailDto.getTailColor());
            tail.setTailLength(tailDto.getTailLength());
            tailsRepository.save(tail);
    }

    public TailDto getTailById(Long id) {
        return TailConverter.entityToDto(tailsRepository.getReferenceById(id));
    }

    public void deleteTailById(Long id) {
        tailsRepository.deleteById(id);
    }


    public List<TailDto> getAllTails() {
        return tailsRepository.findAll().stream().map(TailConverter::entityToDto).collect(Collectors.toList());
    }
}
