package com.example.switchstoreserver.dtos.response;

import com.example.switchstoreserver.models.SwitchesTypes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class SwitchesTypesListResponseDto {
    ArrayList<SwitchesTypes> switchesTypesList;
}
