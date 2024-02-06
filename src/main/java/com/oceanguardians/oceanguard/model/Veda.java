package com.oceanguardians.oceanguard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "veda")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Veda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vedaId;

    @Column(name = "fecha_de_inicio")
    private Date fechaDeInicio;

    @Column(name = "fecha_de_termino")
    private Date fechaDeTermino;

    @Column(name = "descripcion_veda")
    private String descripcionVeda;

    @Column(name = "especificacion")
    private String especificacion;

    @ManyToOne
    @JoinColumn(name = "especies_id")
    private Especies especieEnVeda;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regionDeVeda;

    @ManyToMany(mappedBy = "vedaGuardada")
    private ArrayList<Usuarios> vedaAGuardar;
}
