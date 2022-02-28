package com.example.switchstoreserver.services;

import com.example.switchstoreserver.dtos.response.SwitchTypesListResponseDto;
import com.example.switchstoreserver.models.SwitchTypes;
import com.example.switchstoreserver.repositories.SwitchTypesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class SwitchTypesService {
    
    @Autowired
    private SwitchTypesRepository switchTypesRepository;

    public SwitchTypesListResponseDto getAll() {
        ArrayList<SwitchTypes> switchTypesList = (ArrayList<SwitchTypes>) switchTypesRepository.findAll();

        return new SwitchTypesListResponseDto(switchTypesList);
    }
}
