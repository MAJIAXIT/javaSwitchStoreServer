package com.example.switchstoreserver.dtos.response;

import com.example.switchstoreserver.models.SwitchTypes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class SwitchTypesListResponseDto {
    ArrayList<SwitchTypes> switchTypes;
}
