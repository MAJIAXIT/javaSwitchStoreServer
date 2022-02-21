package com.example.switchstoreserver.services;

import com.example.switchstoreserver.dtos.response.SwitchResponseDto;
import com.example.switchstoreserver.dtos.response.SwitchesListResponseDto;
import com.example.switchstoreserver.models.Switch;
import com.example.switchstoreserver.repositories.SwitchesRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SwitchesService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SwitchesRepository switchesRepository;

    public SwitchesListResponseDto getAll() {
        ArrayList<SwitchResponseDto> switchesList = (ArrayList<SwitchResponseDto>) switchesRepository.findAll().stream().map(aSwitch -> modelMapper.map(aSwitch, SwitchResponseDto.class)).collect(Collectors.toList());

        return new SwitchesListResponseDto(switchesList);
    }

    public SwitchResponseDto getById(int id){
        Switch aSwitch = switchesRepository.findById(id).get();

        return modelMapper.map(aSwitch, SwitchResponseDto.class);
    }

}
