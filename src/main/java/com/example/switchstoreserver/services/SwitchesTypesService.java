package com.example.switchstoreserver.services;

import com.example.switchstoreserver.dtos.response.SwitchesTypesListResponseDto;
import com.example.switchstoreserver.models.SwitchesTypes;
import com.example.switchstoreserver.repositories.SwitchesTypesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class SwitchesTypesService {

    @Autowired
    private SwitchesTypesRepository switchesTypesRepository;

    public SwitchesTypesListResponseDto getAll() {
        ArrayList<SwitchesTypes> switchesTypesList = (ArrayList<SwitchesTypes>) switchesTypesRepository.findAll();

        return new SwitchesTypesListResponseDto(switchesTypesList);
    }
}
