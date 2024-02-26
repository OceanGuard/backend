package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.model.Veda;

import java.util.List;

public interface EspeciesService {
    List<Especies> buscarEspeciesPorRegion(int idRegion);

}
