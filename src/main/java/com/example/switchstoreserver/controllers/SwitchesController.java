package com.example.switchstoreserver.controllers;

import com.example.switchstoreserver.dtos.response.SwitchResponseDto;
import com.example.switchstoreserver.dtos.response.SwitchesListResponseDto;
import com.example.switchstoreserver.services.SwitchesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/switches", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class SwitchesController {

    @Autowired
    private SwitchesService switchesService;

    @GetMapping(value = "/getAll")
    public SwitchesListResponseDto getAll() {
        return switchesService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public SwitchResponseDto getById(@PathVariable int id) {
        return switchesService.getById(id);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        switchesService.deleteById(id);
    }
}
