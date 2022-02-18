package com.example.switchstoreserver.controllers;

import com.example.switchstoreserver.dtos.SwitchResponseDto;
import com.example.switchstoreserver.services.SwitchesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/switches", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class SwitchesController {

    @Autowired
    private SwitchesService switchesService;

    @GetMapping(value = "/getAll")
    public ArrayList<SwitchResponseDto> getAll() {
        return switchesService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public SwitchResponseDto getById(@PathVariable int id) {
        return switchesService.getById(id);
    }

//    @GetMapping(value = "/deleteById/{id}")
//    public void deleteById(@PathVariable int id) {
//        return switchesService.deleteById(id);
//    }
}
