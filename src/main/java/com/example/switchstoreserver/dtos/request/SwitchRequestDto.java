package com.example.switchstoreserver.dtos.request;

import lombok.Data;

@Data
public class SwitchRequestDto {
    public String name;
    public int price;
    public String colour;
    public int typeId;
}
