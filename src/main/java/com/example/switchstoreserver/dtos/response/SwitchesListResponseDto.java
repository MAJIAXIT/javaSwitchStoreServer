package com.example.switchstoreserver.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class SwitchesListResponseDto {
    ArrayList<SwitchResponseDto> switchesList;
}
