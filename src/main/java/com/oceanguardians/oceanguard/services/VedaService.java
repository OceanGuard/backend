package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Veda;

import java.util.List;

public interface VedaService {

    List<Veda> buscarPorNombreEspecie(String nombreEspecie);


}
