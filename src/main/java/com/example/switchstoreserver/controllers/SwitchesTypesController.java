package com.example.switchstoreserver.controllers;

import com.example.switchstoreserver.dtos.response.SwitchesTypesListResponseDto;
import com.example.switchstoreserver.services.SwitchesTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/switchTypes", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SwitchesTypesController {

    @Autowired
    private SwitchesTypesService switchesTypesService;

    @GetMapping(value = "/getAll")
    public SwitchesTypesListResponseDto getAll() {
        return switchesTypesService.getAll();
    }
}
