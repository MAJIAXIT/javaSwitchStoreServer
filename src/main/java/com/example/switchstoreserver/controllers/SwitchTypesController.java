package com.example.switchstoreserver.controllers;

import com.example.switchstoreserver.dtos.response.SwitchTypesListResponseDto;
import com.example.switchstoreserver.services.SwitchTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/switchTypes", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SwitchTypesController {

    @Autowired
    private SwitchTypesService switchTypesService;

    @GetMapping(value = "/getAll")
    public SwitchTypesListResponseDto getAll() {
        return switchTypesService.getAll();
    }
}
