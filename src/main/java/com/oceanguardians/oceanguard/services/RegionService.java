package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Region;

import java.util.List;

public interface RegionService {

    Region buscarRegionPorNombre(String NombreRegion);
    List<Region> listarRegiones();
    void eliminarRegionPorId(Long id);
}
