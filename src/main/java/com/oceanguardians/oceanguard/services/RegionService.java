package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.model.Region;

public interface RegionService {

    Region buscarPorNombreRegion(String nombreRegion);
}
