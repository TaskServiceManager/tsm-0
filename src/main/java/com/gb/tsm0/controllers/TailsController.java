package com.gb.tsm0.controllers;

import com.gb.tsm0.dto.TailDto;
import com.gb.tsm0.servises.TailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/tails")
@RequiredArgsConstructor
public class TailsController {

    private final TailsService tailsService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTail(@RequestBody TailDto tailDto) {
        tailsService.createTail(tailDto);
    }
    @GetMapping("/{id}")
    public TailDto getTail(@PathVariable Long id) {
       return tailsService.getTailById(id);
    }
    @GetMapping
    public List<TailDto> getAllTails() {
        return tailsService.getAllTails();
    }
    @GetMapping("/delete/{id}")
    public void deleteTail(@PathVariable Long id) {
        tailsService.deleteTailById(id);
    }


}
