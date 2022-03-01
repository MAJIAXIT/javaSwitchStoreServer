package com.example.switchstoreserver.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "switches")
public class Switch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String name;

    @Column
    public int price;

    @Column
    public String colour;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    public SwitchesTypes switchType;
}
