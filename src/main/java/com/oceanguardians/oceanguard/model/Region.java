package com.oceanguardians.oceanguard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Table(name = "region")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long regionId;

    @Column(name = "zona_pintada")
    private Double zonaPintada;

    @Column(name = "nombre_region")
    private String nombreRegion;

    @OneToMany(mappedBy = "regionDeVeda")
    private ArrayList<Veda> vedaEsDeRegion;
}
