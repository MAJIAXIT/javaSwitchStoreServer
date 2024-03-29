package com.example.switchstoreserver.dtos.response;

import lombok.Data;

@Data
public class SwitchResponseDto {
    public int id;
    public String name;
    public int price;
    public String colour;
    public String switchType;
}
