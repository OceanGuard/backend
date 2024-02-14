package com.oceanguardians.oceanguard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Table(name = "especies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Especies {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long especiesId;

        @Column(name = "nombre_especie", unique = true)
        private String nombreEspecie;

        @Column(name = "nombre_cientifico")
        private String nombreCientifico;

        @OneToMany(mappedBy = "especieEnVeda")
        private ArrayList<Veda> vedaEnEspecies;
}
