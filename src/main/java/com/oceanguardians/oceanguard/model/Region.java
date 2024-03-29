package com.oceanguardians.oceanguard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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


    @Column(name = "coordenada-x")
    private Double coordenadaX;

    @Column(name = "coordenada-y")
    private Double coordenadaY;

    @Column(name = "nombre_region")
    private String nombreRegion;

    @OneToMany(mappedBy = "regionDeVeda", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Veda> vedaEsDeRegion;
}
