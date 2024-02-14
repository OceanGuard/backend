package com.oceanguardians.oceanguard.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VedaDTO {

    private String nombreEspecie;
    private String descripcionVeda;
    private Date inicioVeda;
    private Date finVeda;
    private String RegionDeVeda;
}
